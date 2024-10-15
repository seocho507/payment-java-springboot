package com.seocho507.paymentjava.payment.adapter.out.persistent.repository;

import com.seocho507.paymentjava.payment.domain.PaymentEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.reactive.TransactionalOperator;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Repository
public class R2DBCPaymentRepository implements PaymentRepository {

    private static final String PAYMENT_EVENT_INSERT_QUERY = """
                                    INSERT INTO payment_events (buyer_id, order_id. order_name)
                                    VALUES (:buyerId, :orderId, :orderName)
            """;

    private final DatabaseClient databaseClient;
    private final TransactionalOperator transactionalOperator;

    @Override
    public Mono<Void> save(PaymentEvent paymentEvent) {

        return databaseClient.sql(PAYMENT_EVENT_INSERT_QUERY)
                .bind("buyerId", paymentEvent.buyerId())
                .bind("orderId", paymentEvent.orderId())
                .bind("orderName", paymentEvent.orderName())
                .fetch()
                .rowsUpdated()
                .as(transactionalOperator::transactional)
                .then();
    }

}
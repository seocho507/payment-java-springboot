package com.seocho507.paymentjava.payment.domain;

import java.util.Map;
import java.util.Objects;

public record WalletEventMessage(
        WalletEventMessageType type,
        Map<String, Object> payload,
        Map<String, Object> metadata
) {

    public WalletEventMessage(WalletEventMessageType type, Map<String, Object> payload, Map<String, Object> metadata) {
        this.type = type;
        this.payload = Objects.isNull(payload) ? Map.of() : payload;
        this.metadata = Objects.isNull(metadata) ? Map.of() : metadata;
    }


    public String orderId() {
        return (String) payload.get("orderId");
    }
}


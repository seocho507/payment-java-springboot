package com.seocho507.paymentjava.payment.domain;

import lombok.Getter;

@Getter
public enum PaymentType {
    NORMAL("일반결제");

    private final String description;

    PaymentType(String description) {
        this.description = description;
    }

}

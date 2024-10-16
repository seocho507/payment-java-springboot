package com.seocho507.paymentjava.payment.domain;

import lombok.Getter;

@Getter
public enum WalletEventMessageType {
    SUCCESS("정산 처리 성공");

    private final String description;

    WalletEventMessageType(String description) {
        this.description = description;
    }
}

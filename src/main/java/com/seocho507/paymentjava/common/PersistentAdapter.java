package com.seocho507.paymentjava.common;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Component
public @interface PersistentAdapter {
}

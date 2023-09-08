package org.test.guice.quick.impl;

import org.test.guice.quick.BaseProcessor;

public class CreditCardProcessor implements BaseProcessor {

    @Override
    public String process() {
        return "credit card";
    }
}

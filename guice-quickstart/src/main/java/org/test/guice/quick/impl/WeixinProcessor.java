package org.test.guice.quick.impl;

import org.test.guice.quick.BaseProcessor;

public class WeixinProcessor implements BaseProcessor {
    @Override
    public String process() {
        return "wei xin";
    }
}

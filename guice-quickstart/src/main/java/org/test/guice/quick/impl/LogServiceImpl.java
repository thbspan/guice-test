package org.test.guice.quick.impl;

import org.test.guice.quick.LogService;

public class LogServiceImpl implements LogService {

    @Override
    public void log(String msg) {
        System.out.println("------------- LOG " + msg);
    }
}

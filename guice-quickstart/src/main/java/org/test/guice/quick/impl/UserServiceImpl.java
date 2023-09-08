package org.test.guice.quick.impl;

import org.test.guice.quick.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void process() {
        System.out.println("user service to do");
    }
}

package org.test.guice.quick.impl;

import jakarta.inject.Inject;
import org.test.guice.quick.Application;
import org.test.guice.quick.LogService;
import org.test.guice.quick.UserService;

public class MyApplication implements Application {
    private final UserService userService;
    private final LogService logService;

    @Inject
    public MyApplication(UserService userService, LogService logService) {
        this.userService = userService;
        this.logService = logService;
    }

    @Override
    public void work() {
        userService.process();
        logService.log("program work fine");
    }
}

package org.test.guice.quick.module;

import com.google.inject.AbstractModule;
import org.test.guice.quick.Application;
import org.test.guice.quick.LogService;
import org.test.guice.quick.UserService;
import org.test.guice.quick.impl.LogServiceImpl;
import org.test.guice.quick.impl.MyApplication;
import org.test.guice.quick.impl.UserServiceImpl;

public class MyApplicationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(LogService.class).to(LogServiceImpl.class);
        bind(UserService.class).to(UserServiceImpl.class);
        bind(Application.class).to(MyApplication.class);
    }
}

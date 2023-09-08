package org.test.guice;

import jakarta.inject.Inject;

public class UserService {

    @Inject
    private UserDao userDao;

    public void say() {
        userDao.say();
    }
}

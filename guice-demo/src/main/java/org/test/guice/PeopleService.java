package org.test.guice;

import jakarta.inject.Inject;

public class PeopleService {

    @Inject
    private PeopleDao peopleDao;

    public void say() {
        peopleDao.say();
    }
}

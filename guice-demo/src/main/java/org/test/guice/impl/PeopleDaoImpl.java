package org.test.guice.impl;

import org.test.guice.PeopleDao;

public class PeopleDaoImpl implements PeopleDao {

    @Override
    public void say() {
        System.out.println("people dao is saying");
    }
}

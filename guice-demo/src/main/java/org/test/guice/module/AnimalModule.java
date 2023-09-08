package org.test.guice.module;

import com.google.inject.AbstractModule;

public class AnimalModule extends AbstractModule {

    @Override
    protected void configure() {
        // 这行的意思即是把Dog绑定给IAnimal
        bind(IAnimal.class).to(Dog.class);
        // 下面
        bind(IAnimal.class).annotatedWith(Super.class).to(SuperDog.class);
    }
}

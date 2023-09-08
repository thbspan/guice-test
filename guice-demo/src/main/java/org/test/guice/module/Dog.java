package org.test.guice.module;

public class Dog implements IAnimal {
    @Override
    public void talk() {
        System.out.println("i am dog!");
    }
}

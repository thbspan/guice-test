package org.test.guice.module;

import jakarta.inject.Inject;

public class AnimalService {

    @Inject
    private IAnimal dog;

    @Inject
    @Super
    private IAnimal superDog;

    public void talk() {
        System.out.println("dog will talk");
        dog.talk();
        System.out.println("super will talk");
        superDog.talk();
    }
}

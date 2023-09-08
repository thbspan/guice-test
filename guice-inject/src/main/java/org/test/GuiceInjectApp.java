package org.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.test.guice.Applets;
import org.test.guice.CommandLineModule;
import org.test.guice.MainModule;

public class GuiceInjectApp {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MainModule(),new CommandLineModule(args));
        Applets.get(injector,args[0]).run();
    }
}

package org.test;

import com.google.inject.Guice;
import org.test.guice.MainModule;
import org.test.guice.MyApplet;

public class GuiceApp {

    public static void main(String[] args) {
        MyApplet mainApplet = Guice.createInjector(new MainModule()).getInstance(MyApplet.class);
        mainApplet.run();
    }
}

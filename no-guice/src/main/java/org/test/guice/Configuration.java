package org.test.guice;

import org.test.guice.demo.PrintStreamWriter;
import org.test.guice.demo.StringWritingApplet;

public class Configuration {

    public static MyApplet getMainApplet(){
        return new StringWritingApplet(new PrintStreamWriter(System.out), () -> "Hello World!");
    }

}

package org.test.guice.print;

import org.test.guice.MyApplet;

public class PrintLineApplet implements MyApplet {

    @Override
    public void run() {
        System.out.println("PrintLineApplet");
    }
}

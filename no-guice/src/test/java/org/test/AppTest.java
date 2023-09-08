package org.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.test.guice.Configuration;
import org.test.guice.MyApplet;

class AppTest {

    @Test
    void testGetMainApplet() {
        MyApplet mainApplet = Configuration.getMainApplet();
        Assertions.assertNotNull(mainApplet);
        mainApplet.run();
    }
}

package org.test;

import org.junit.jupiter.api.Test;

class GuiceInjectAppTest {

    @Test
    void testMain() {
        String[] args = new String[] {"println"};
        GuiceInjectApp.main(args);
        GuiceInjectApp.main(new String[]{"hello", "world"});
    }
}

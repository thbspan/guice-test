package org.test.guice.server.impl;

import com.google.inject.Guice;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SessionManagerTest {
    @Inject
    SessionManager sessionManager;

    @BeforeEach
    public void setUp() {
        Guice.createInjector(new ServerModule()).injectMembers(this);
    }

    @Test
    void getSessionId() throws Exception {
        Long sessionId1 = sessionManager.getSessionId();
        // Pretend we sleep long enough so session expires.
        Thread.sleep(100);
        Long sessionId2 = sessionManager.getSessionId();
        assertNotEquals(sessionId2, sessionId1);
    }
}

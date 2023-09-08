package org.test.guice;

import com.google.inject.ConfigurationException;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PeopleServiceTest {

    /**
     * 测试验证guice不会自动查找实现类
     */
    @Test
    void testInject() {
        Assertions.assertThrowsExactly(ConfigurationException.class, () -> {
            final Injector injector = Guice.createInjector();
            final PeopleService peopleService = injector.getInstance(PeopleService.class);
            peopleService.say();
        });
    }
}

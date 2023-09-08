package org.test.guice.server.impl;

import com.google.common.base.Joiner;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class LoggingInterceptor implements MethodInterceptor {
    @Inject
    @SessionId
    private Provider<Long> sessionIdProvider;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        System.out.printf("In session %d: Calling %s#%s(%s)%n",
                sessionIdProvider.get(),
                method.getDeclaringClass().getName(),
                method.getName(),
                Joiner.on(",").join(invocation.getArguments()));
        return invocation.proceed();
    }
}

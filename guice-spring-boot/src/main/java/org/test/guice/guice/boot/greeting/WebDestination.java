package org.test.guice.guice.boot.greeting;

import com.google.inject.servlet.RequestScoped;
import jakarta.inject.Inject;
import org.test.guice.guice.demo.MyDestination;

@RequestScoped
public class WebDestination implements MyDestination {
    private final StringBuilder sb;

    @Inject
    public WebDestination(StringBuilder sb) {
        System.out.println("WebDestination constructed.");
        this.sb = sb;
    }

    @Override
    public void write(String s) {
        sb.append(s);
    }

    public String getResult() {
        return sb.toString();
    }
}

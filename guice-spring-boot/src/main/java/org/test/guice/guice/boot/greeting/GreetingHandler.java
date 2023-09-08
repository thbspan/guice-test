package org.test.guice.guice.boot.greeting;

import com.google.inject.servlet.RequestScoped;
import jakarta.inject.Inject;
import org.test.guice.guice.MyApplet;

@RequestScoped
public class GreetingHandler {

    private final RequestParams params;
    private final WebDestination destination;
    private final MyApplet applet;

    @Inject
    public GreetingHandler(RequestParams params, WebDestination destination, MyApplet applet) {
        this.params = params;
        this.destination = destination;
        this.applet = applet;
    }

    public String getByName(String name) {
        params.setGreetingName(name);
        applet.run();
        return destination.getResult();
    }

}

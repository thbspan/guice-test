package org.test.guice.print;

import com.google.inject.AbstractModule;
import org.test.guice.Applets;

public class PrintLineModule extends AbstractModule {

    @Override
    protected void configure() {
        /*MapBinder.newMapBinder(binder(),String.class,MyApplet.class)
                .addBinding("println").to(PrintLineApplet.class);*/
        Applets.registerApplet(binder()).named("println").to(PrintLineApplet.class);
    }
}

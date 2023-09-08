package org.test.guice.demo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.test.guice.Applets;
import org.test.guice.Args;

import java.io.PrintStream;
import java.util.List;

public class HelloWorldModule extends AbstractModule {

    @Override
    protected void configure() {
        /* MapBinder.newMapBinder(binder(),String.class,MyApplet.class)
                .addBinding("hello").to(StringWritingApplet.class);*/
        Applets.registerApplet(binder()).named("hello").to(StringWritingApplet.class);
        // StringWritingApplet 实现了 MyApplet
        // Stringwritingapplet Realized MyApplet
        // bind(MyApplet.class).annotatedWith(Names.named("hello")).to(StringWritingApplet.class);
        // PrintStreamWriter 实现了 MyDestination
        // Printstreamwriter Realized Mydestination
        bind(MyDestination.class).to(PrintStreamWriter.class);
        // PrintStream 绑定 System.out
        // PrintStream binding System.out
        bind(PrintStream.class).toInstance(System.out);
        // 作用等同于getString方法
        // Function Equals GetString method
        //bind(String.class).annotatedWith(Output.class).toInstance("Hello World");
    }

    @Provides
    @Output
    private String getString(@Args List<String> args) {
        return args.isEmpty() ? "empty" : args.get(0);
    }
}

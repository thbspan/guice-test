package org.test.guice.demo;

import com.google.inject.AbstractModule;
import org.test.guice.MyApplet;

import java.io.PrintStream;

public class HelloWorldModule extends AbstractModule {

    @Override
    protected void configure() {
        // StringWritingApplet 实现了 MyApplet
        // Stringwritingapplet Realized MyApplet
        bind(MyApplet.class).to(StringWritingApplet.class);
        // PrintStreamWriter 实现了 MyDestination
        // Printstreamwriter Realized Mydestination
        bind(MyDestination.class).to(PrintStreamWriter.class);
        // PrintStream 绑定 System.out
        // PrintStream binding System.out
        bind(PrintStream.class).toInstance(System.out);
        // 作用等同于getString方法
        // Function Equals GetString method
        bind(String.class).annotatedWith(Output.class).toInstance("Hello World");
        // 当业务便复杂，需要获取数据，可以使用toProvider
        // When the business is complex, need to get data, you can use Toprovider
        /*bind(String.class).toProvider(new Provider<String>() {
            @Override
            public String get() {
                return "Hello World";
            }
        });*/
    }
}

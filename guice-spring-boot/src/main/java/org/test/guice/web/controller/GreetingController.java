package org.test.guice.web.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.test.guice.guice.boot.greeting.GreetingHandler;

@RestController
public class GreetingController {

    @Resource
    private GreetingHandler greetingHandler;

    @GetMapping("/greeting")
    String greeting(@RequestParam("name") String name) {
        return greetingHandler.getByName(name);
    }
}

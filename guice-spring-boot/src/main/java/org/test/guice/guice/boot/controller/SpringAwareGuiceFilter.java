package org.test.guice.guice.boot.controller;

import com.google.inject.servlet.GuiceFilter;
import jakarta.servlet.annotation.WebFilter;

@WebFilter
public class SpringAwareGuiceFilter extends GuiceFilter {

}

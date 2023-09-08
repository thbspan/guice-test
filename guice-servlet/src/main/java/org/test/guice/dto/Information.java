package org.test.guice.dto;

import com.google.inject.servlet.RequestParameters;
import com.google.inject.servlet.RequestScoped;
import jakarta.inject.Inject;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@RequestScoped
public class Information {

    @Inject
    @RequestParameters
    Map<String, String[]> params;

    public String getAllParameters() {
        return params.entrySet()
                .stream()
                .map(entry -> entry.getKey() + " : " + Arrays.toString(entry.getValue()))
                .collect(Collectors.joining(", "));
    }
}

package com.ada.micronautsimpleapi.rest;

import com.ada.micronautsimpleapi.domain.Greeting;
import com.ada.micronautsimpleapi.service.GreetingService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.constraints.NotBlank;

@Controller("/api/greeting")
public class SimpleApiController {

    private static final Logger log = LoggerFactory.getLogger(SimpleApiController.class);

    private final GreetingService greetingService;

    public SimpleApiController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Get
    public Greeting greetName(@QueryValue(defaultValue = "World") @NotBlank String name) {
        log.info("Received request, name: {}", name);
        return greetingService.greet(name);
    }
}

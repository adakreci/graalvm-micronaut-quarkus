package com.ada.quarkussimpleapi.rest;

import com.ada.quarkussimpleapi.domain.Greeting;
import com.ada.quarkussimpleapi.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.inject.Inject;
import jakarta.validation.constraints.NotBlank;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/api/greeting")
public class SimpleApiResource {

    private static final Logger log = LoggerFactory.getLogger(SimpleApiResource.class);

    @Inject
    GreetingService greetingService;

    @GET
    public Greeting greetName(@QueryParam("name") @DefaultValue("World") @NotBlank String name) {
        log.info("Received request, name: {}", name);
        return greetingService.greet(name);
    }
}
package com.ada.quarkussimpleapi.service;

import com.ada.quarkussimpleapi.domain.Greeting;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingServiceImpl implements GreetingService {

    @Override
    public Greeting greet(String name) {
        String message = String.format("Hello %s!!!", name);
        return new Greeting(message);
    }
}

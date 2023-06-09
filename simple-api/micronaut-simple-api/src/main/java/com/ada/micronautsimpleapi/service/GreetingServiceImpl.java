package com.ada.micronautsimpleapi.service;

import com.ada.micronautsimpleapi.domain.Greeting;
import jakarta.inject.Singleton;

@Singleton
public class GreetingServiceImpl implements GreetingService {

    @Override
    public Greeting greet(String name) {
        String message = String.format("Hello %s!!!", name);
        return new Greeting(message);
    }
}

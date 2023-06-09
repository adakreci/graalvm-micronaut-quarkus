package com.ada.micronautsimpleapi.service;

import com.ada.micronautsimpleapi.domain.Greeting;

public interface GreetingService {

    Greeting greet(String name);
}

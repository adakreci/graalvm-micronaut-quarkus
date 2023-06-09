package com.ada.micronautsimpleapi.domain;

import io.micronaut.core.annotation.Introspected;

@Introspected
public record Greeting(String message) {
}

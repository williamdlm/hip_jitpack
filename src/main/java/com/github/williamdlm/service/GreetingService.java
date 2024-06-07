package com.github.williamdlm.service;

import jakarta.jws.WebService;

@WebService
public interface GreetingService {
    String sayHi(String text);

    String sayHello(String text);
}

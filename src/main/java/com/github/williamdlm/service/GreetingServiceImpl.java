package com.github.williamdlm.service;

public class GreetingServiceImpl implements GreetingService{
    @Override
    public String sayHi(String text) {
        return "Hi " + text;
    }

    @Override
    public String sayHello(String text) {
        return "Hello " + text;
    }
}

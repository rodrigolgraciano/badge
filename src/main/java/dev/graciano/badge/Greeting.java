package dev.graciano.badge;

import org.springframework.stereotype.Service;

@Service
public class Greeting {

    public String sayHello(){
        return "Hello";
    }

    public String sayHi(){
        return "Hi";
    }
}

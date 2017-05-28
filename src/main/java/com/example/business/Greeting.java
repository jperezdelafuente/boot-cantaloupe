package com.example.business;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by geva on 26/05/17.
 */
@Component
public class Greeting {

    @Value("${greeting.user}")
    private String user;

    public String greet() {
        StringBuilder hello = new StringBuilder("Holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ")
                .append(user)
                .append("!");
        return hello.toString();
    }

}

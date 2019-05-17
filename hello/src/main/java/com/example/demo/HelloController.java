package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 *  Routing starting point is defined in 'authorization' gateway in application.properties.
 *  Zull proxy starts routing to 'hello service' from '/hello'
 *  So keep in mind that any routing in this controller must start with '/hello/'
 *  When you call the service in Postman
 */
@RestController
@RequestMapping("/")
public class HelloController {


    @Autowired
    private Environment env;

    @RequestMapping("/")
    public String blahblahblah() {
        return "Service running on port " + env.getProperty("local.server.port");
    }

    @RequestMapping("/hello2")
    public String getHello2() {
        return "Whaaaazaaaa ?! from port " + env.getProperty("local.server.port");
    }

}

package org.microservices.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Service1Controller {

    @GetMapping(value = "/hi")
    public String hi(){
        return "Hi";
    }
}

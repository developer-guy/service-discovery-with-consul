package org.microservices.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/hellos")
public class Service1Controller {

    @GetMapping(value = "/hi")
    public String hi(){
        return "Hi";
    }
}

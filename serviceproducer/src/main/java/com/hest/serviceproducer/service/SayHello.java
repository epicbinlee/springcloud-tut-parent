package com.hest.serviceproducer.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name;
    }
}
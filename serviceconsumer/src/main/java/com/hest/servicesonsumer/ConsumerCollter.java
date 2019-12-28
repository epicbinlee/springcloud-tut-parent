package com.hest.servicesonsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class ConsumerCollter implements CommandLineRunner {

    @Autowired
    private HelloService helloService;

    @Override
    public void run(String... args) throws Exception {
        String leebin = helloService.hello("leebin");
        System.out.println(leebin);
    }
}

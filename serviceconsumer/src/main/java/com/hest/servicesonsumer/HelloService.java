package com.hest.servicesonsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * https://blog.csdn.net/zhou199252/article/details/80745151
 */
@Service
@FeignClient(name = "spring-cloud-producer")
public interface HelloService {
    @RequestMapping(value = "/hi")
    String hello(@RequestParam(value = "name") String name);
}

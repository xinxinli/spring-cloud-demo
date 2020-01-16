package com.example.springcloudconsumer.feign.fallback;

import com.example.springcloudconsumer.feign.HelloFeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloFeignClientFallback implements HelloFeignClient {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this message send failed ";
    }
}

package com.example.springcloudconsumer.feign;

import com.example.springcloudconsumer.feign.fallback.HelloFeignClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "spring-cloud-producer",path="/producer",fallback = HelloFeignClientFallback.class)
public interface  HelloFeignClient {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}

package com.example.springcloudconsumer.controller;

import com.example.springcloudconsumer.feign.HelloFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value="/user",tags={"测试pringCloud的消费者"})
public class ConsumerController {

    @Autowired
    HelloFeignClient helloFeignClient;

    @ApiOperation(notes = "获取-姓名", httpMethod = "GET", value = "获取-姓名")
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloFeignClient.hello(name);
    }

}

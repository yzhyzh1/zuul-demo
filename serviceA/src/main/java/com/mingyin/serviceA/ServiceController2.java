package com.mingyin.serviceA;

import hello.MyApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController2 implements MyApi {

    @Override
    public String getName(String name) {
        return name;
    }
}

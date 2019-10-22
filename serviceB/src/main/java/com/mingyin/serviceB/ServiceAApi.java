package com.mingyin.serviceB;

import hello.MyApi;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("ServiceA")
public interface ServiceAApi extends MyApi {
}

package com.mingyin.serviceB;

import com.mingyin.api.ServiceAInterface;
import org.apache.catalina.Service;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("ServiceA")
public interface ServiceAClient extends ServiceAInterface {

}

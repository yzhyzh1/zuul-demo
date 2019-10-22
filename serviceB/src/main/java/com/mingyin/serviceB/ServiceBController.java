package com.mingyin.serviceB;

import com.mingyin.api.User;
import com.netflix.discovery.converters.Auto;
import feign.Param;
import hello.MyApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ServiceB")
public class ServiceBController {

    @Autowired
    private ServiceAClient serviceA;
    @Autowired
    private ServiceAApi serviceAApi;

    @RequestMapping(value = "/sayHello/{id}", method = RequestMethod.GET)
    public String greeting(@PathVariable("id") Long id,
                           @RequestParam("name") String name,
                           @RequestParam("age") Integer age) {
        return serviceA.sayHello(id, name, age);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String createUser(@RequestBody User user) {
        return serviceA.createUser(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        return serviceA.updateUser(id, user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("id") Long id) {
        return serviceA.deleteUser(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getById(@PathVariable("id") Long id) {
        return serviceA.getById(id);
    }

    @RequestMapping(value = "/getname", method = RequestMethod.GET)
    public String getname(@Param("name") String name) {
        System.out.println("_________________________________________________");
        System.out.println(name);
        return serviceAApi.getName(name);
    }

}

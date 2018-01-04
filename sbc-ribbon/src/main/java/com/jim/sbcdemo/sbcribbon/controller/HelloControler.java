package com.jim.sbcdemo.sbcribbon.controller;

import com.jim.sbcdemo.sbcribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        System.out.println("---------------name is:"+name);
        return helloService.hiService(name);
    }


}

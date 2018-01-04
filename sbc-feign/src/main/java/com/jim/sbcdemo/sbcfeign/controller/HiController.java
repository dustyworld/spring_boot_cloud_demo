package com.jim.sbcdemo.sbcfeign.controller;

import com.jim.sbcdemo.sbcfeign.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by itlocal on 2017/12/26.
 */
@RestController
public class HiController {

    @Autowired
    private SchedualService schedualService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){

        return schedualService.sayHiFromClientOne(name);
    }
}

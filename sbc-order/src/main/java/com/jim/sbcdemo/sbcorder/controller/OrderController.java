package com.jim.sbcdemo.sbcorder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by itlocal on 2017/12/15.
 */
@RestController
public class OrderController {
    @RequestMapping("/getOrderNum")
    public String getOrderNum(){

        return "33344";
    }
}



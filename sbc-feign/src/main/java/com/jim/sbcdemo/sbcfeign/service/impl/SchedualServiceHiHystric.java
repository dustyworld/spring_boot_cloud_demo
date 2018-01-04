package com.jim.sbcdemo.sbcfeign.service.impl;

import com.jim.sbcdemo.sbcfeign.service.SchedualService;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "--- feign client  --- sorry,"+name;
    }
}

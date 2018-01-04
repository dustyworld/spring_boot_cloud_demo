package com.jim.sbcdemo.sbcfeign.service;

import com.jim.sbcdemo.sbcfeign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by itlocal on 2017/12/26.
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
@Service
public interface SchedualService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

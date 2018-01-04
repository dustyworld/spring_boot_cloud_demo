package com.jim.sbcdemo.sbcuser.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.jim.sbcdemo.sbcuser.entity.UserModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jim on 2017/12/15.
 */

@RestController
@RequestMapping("/sbc-user")
public class UserController {

    /*@RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(@RequestBody UserModel userReq) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        //map json to student
        UserModel user = mapper.readValue(jsonString, UserModel.class);
        System.out.println(user);

        jsonString = mapper.writeValueAsString(user);
        System.out.println(jsonString);

        //调用远程服务
        ResponseEntity<Object> res = restTemplate.getForEntity("http://sbc-order/getOrderNum", Object.class, user);
        jsonString = mapper.writeValueAsString(res);

        return jsonString;
    }*/

    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return "hello, "+name;
    }

}

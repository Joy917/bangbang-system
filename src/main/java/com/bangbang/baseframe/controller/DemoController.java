package com.bangbang.baseframe.controller;

import com.bangbang.baseframe.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Joy
 * @Date 2018/12/23 20:26
 **/
@RequestMapping(value = "/demo",produces = "application/json;charset=UTF-8")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/")
    String sayHello(){
        return "你好!";
    }

    @RequestMapping(value = "/saveDemo",method = RequestMethod.POST)
    void saveDemo(
            @RequestParam (value = "name",required = true) String name,
            @RequestParam (value = "age",required = true) Integer age){
         demoService.saveDemo(name,age);
    }

}

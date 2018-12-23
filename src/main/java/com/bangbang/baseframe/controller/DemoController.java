package com.bangbang.baseframe.controller;

import com.bangbang.baseframe.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Joy
 * @Date 2018/12/23 20:26
 **/
@RequestMapping(value = "/demo",produces = "application/json;charset=UTF-8")
@RestController
public class DemoController {

    private DemoService demoService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello(){
        return "你好!";
    }

    @RequestMapping(value = "/saveDemo",method = RequestMethod.POST)
    String saveDemo(
            @RequestParam(value = "name", required = true) String name,
            @RequestParam (value = "age",required = true) Integer age){
        return demoService.saveDemo(name, age);
    }

}

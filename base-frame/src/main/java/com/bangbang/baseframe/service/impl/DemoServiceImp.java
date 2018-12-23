package com.bangbang.baseframe.service.impl;

import com.bangbang.baseframe.dao.DemoDAO;
import com.bangbang.baseframe.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author Joy
 * @Date 2018/12/23 21:20
 **/
public class DemoServiceImp implements DemoService {
    @Autowired
    private DemoDAO demoDAO;

    @Override
    public void saveDemo(String name, Integer age) {
        demoDAO.saveDemo(name, age);
    }
}

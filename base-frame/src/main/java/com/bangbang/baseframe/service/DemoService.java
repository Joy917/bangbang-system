package com.bangbang.baseframe.service;

import javax.transaction.Transactional;

@Transactional
public interface DemoService {
    void saveDemo(String name,Integer age);
}

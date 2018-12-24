package com.bangbang.baseframe.service;

import javax.transaction.Transactional;

@Transactional
public interface DemoService {
    String saveDemo(String name, Integer age);
}

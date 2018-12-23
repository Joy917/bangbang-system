package com.bangbang.baseframe.service;

import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Transactional
@Component
public interface DemoService {
    String saveDemo(String name, Integer age);
}

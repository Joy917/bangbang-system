package com.bangbang.baseframe.dao;

import com.bangbang.baseframe.entities.DemoDO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DemoDAO extends JpaRepository<DemoDO, Long> {
}

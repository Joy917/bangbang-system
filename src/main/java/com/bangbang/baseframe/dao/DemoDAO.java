package com.bangbang.baseframe.dao;

import com.bangbang.baseframe.entities.DemoDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoDAO extends JpaRepository<DemoDO, Long> {
    @Modifying
    @Query(value = "insert into demo (name, age) values(?1, ?2)",nativeQuery = true)
    void saveDemo(String name, Integer age);

}

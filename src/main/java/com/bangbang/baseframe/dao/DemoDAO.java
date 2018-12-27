package com.bangbang.baseframe.dao;

import com.bangbang.baseframe.entities.DemoDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoDAO extends JpaRepository<DemoDO, Long> {
//    @Modifying
//    @Query(value = "insert into test (school_name, class_num) values(?1, ?2)",nativeQuery = true)
//    void saveTest(String schoolName, Integer classNum);

}

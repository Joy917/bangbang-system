package com.bangbang.baseframe.entities;

import javax.persistence.*;

@Entity
@Table(name = "DEMO")
public class DemoDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;
}

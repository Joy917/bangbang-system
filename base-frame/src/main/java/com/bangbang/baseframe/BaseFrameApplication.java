package com.bangbang.baseframe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories({"com.bangbang.baseframe.entities"})
@ComponentScan({"com.bangbang.baseframe"})
@SpringBootApplication
public class BaseFrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseFrameApplication.class, args);
	}

}


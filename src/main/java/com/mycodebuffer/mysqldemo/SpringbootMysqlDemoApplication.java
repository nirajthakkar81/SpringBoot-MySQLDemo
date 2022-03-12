package com.mycodebuffer.mysqldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringbootMysqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMysqlDemoApplication.class, args);
	}

}

package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.accp.dao")
public class Example2Application {

	public static void main(String[] args) {
		SpringApplication.run(Example2Application.class, args);
	}

}

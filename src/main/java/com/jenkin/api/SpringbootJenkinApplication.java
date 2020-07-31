package com.jenkin.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinApplication {
	
	
	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application started .....");
	}

	public static void main(String[] args) {
		logger.info("Application executed .....");
		SpringApplication.run(SpringbootJenkinApplication.class, args);
	}

}

package com.example.demo;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	public static Logger logger = (Logger) LoggerFactory.getLogger(DemoApplication.class);
	  
	@PostConstruct
	public void intt() {
		logger.info("Application started ...bhai");
		
	}

	public static void main(String[] args) {
		
		logger.info("Application executed ...bhai");
		SpringApplication.run(DemoApplication.class, args);
	}

}

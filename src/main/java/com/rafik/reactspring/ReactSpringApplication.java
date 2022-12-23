package com.rafik.reactspring;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactSpringApplication {
	public static Logger log = LoggerFactory.getLogger(ReactSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ReactSpringApplication.class, args);
	}

	@PostConstruct
	public static void init() {
		log.info("init ... !!! ... !!! ...");
	}

}

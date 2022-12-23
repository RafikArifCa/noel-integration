package com.rafik.reactspring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReactSpringApplicationTests {
	public static Logger log = LoggerFactory.getLogger(ReactSpringApplication.class);

	@Test
	void contextLoads() {
		log.info("test contextLoads...");
		assertEquals(true, true);
	}

}

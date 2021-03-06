package com.jenkin.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("test....");
	}

}

package com.jenkin.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinApplicationTests {

	@Test
	void contextLoads() {
		logger.info("test....");
		logger.info("test case executing log second");
	}

}

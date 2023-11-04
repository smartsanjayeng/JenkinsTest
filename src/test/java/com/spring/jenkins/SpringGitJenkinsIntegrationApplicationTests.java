package com.spring.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringGitJenkinsIntegrationApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(SpringGitJenkinsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		log.info("Its my Test calss SpringGitJenkinsIntegrationApplicationTests ..........");
		assertEquals(true, true);
	}

}

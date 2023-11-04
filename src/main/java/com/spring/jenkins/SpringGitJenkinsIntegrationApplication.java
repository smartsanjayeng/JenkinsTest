package com.spring.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGitJenkinsIntegrationApplication implements CommandLineRunner{

	
	private static final Logger log = LoggerFactory.getLogger(SpringGitJenkinsIntegrationApplication.class);

	public static void main(String[] args) {
		log.info("SpringGitJenkinsIntegrationApplication Started......");
		SpringApplication.run(SpringGitJenkinsIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("CommandLineRunner run method Started......");
		
	}

}

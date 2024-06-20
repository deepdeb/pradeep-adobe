package com.pradeep.chat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ChatApplication {

	private static final Logger logger = LoggerFactory.getLogger(ChatApplication.class);

	public static void main(String[] args) {
		Environment env = SpringApplication.run(ChatApplication.class, args).getEnvironment();
		String port = env.getProperty("server.port");
		logger.info("Application listening on port: " + port);
	}

}

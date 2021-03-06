package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestLoggingApplication {


  private static final Logger logger = LoggerFactory.getLogger(TestLoggingApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(TestLoggingApplication.class, args);
    logger.info("*This is for logging and spring configuration");
  }



}

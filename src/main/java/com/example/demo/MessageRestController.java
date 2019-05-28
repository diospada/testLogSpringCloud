package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageRestController {

  private static final Logger logger = LoggerFactory.getLogger(TestLoggingApplication.class);

  @Value("${message}")
  private String message;

  @RequestMapping("/message")
  String getMessage() {
    logger.info("Test 1223");
    return this.message;
  }




}

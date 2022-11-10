package com.shaunthomas999.playground;

import com.shaunthomas999.playground.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class SpringPlaygroundApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringPlaygroundApplication.class, args);
  }
}

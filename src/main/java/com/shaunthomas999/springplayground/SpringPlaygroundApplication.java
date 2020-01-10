package com.shaunthomas999.springplayground;

import com.shaunthomas999.springplayground.config.ApplicationProperties;
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

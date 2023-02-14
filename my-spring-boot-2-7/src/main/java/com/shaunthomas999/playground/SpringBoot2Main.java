package com.shaunthomas999.playground;

import com.shaunthomas999.playground.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class SpringBoot2Main {

  public static void main(String[] args) {
    SpringApplication.run(SpringBoot2Main.class, args);
  }
}

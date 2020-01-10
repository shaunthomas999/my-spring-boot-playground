package com.shaunthomas999.springplayground.controller;

import com.shaunthomas999.springplayground.services.SomeService;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ConditionalOnProperty - see the table in
 *   https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionalOnProperty.html
 *
 *   - condition will match only when enabled=true (if the property is missing in config, then it will be disabled)
 */
@RestController
@AllArgsConstructor
@ConditionalOnProperty(name = "feature.boolean-flag.enabled")
public class SpringRestController {

  private final SomeService someService;

  @GetMapping("/api")
  public ResponseEntity<Void> restHandler() {
    return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
  }

  @GetMapping("/api/2")
  public ResponseEntity<String> restHandler2() {
    someService.someMethod();
    return ResponseEntity.ok("");
  }
}

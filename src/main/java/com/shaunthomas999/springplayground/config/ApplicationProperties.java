package com.shaunthomas999.springplayground.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/*
 * Note: @ConstructorBinding makes the binding immutable here. If there are more than one constructor, it should be
 * moved to one of the constructor rather than class.
 */
@Getter
@ConstructorBinding
@ConfigurationProperties("app")
public class ApplicationProperties {
  String testProperty1;
  String testProperty2;

  public ApplicationProperties(String testProperty1, String testProperty2) {
    this.testProperty1 = testProperty1;
    this.testProperty2 = testProperty2;
  }
}

package com.shaunthomas999.playground.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class SampleAppConfig {

  /**
   * RequestResponseLoggingFilter is registered in here
   * TransactionFilter is registered automatically bcz of @Component annotation
   *
   * Ref: https://www.baeldung.com/spring-boot-add-filter
   */
  @Bean
  public FilterRegistrationBean<RequestResponseLoggingFilter> loggingFilter(){
    log.info("init");

    FilterRegistrationBean<RequestResponseLoggingFilter> registrationBean = new FilterRegistrationBean<>();

    registrationBean.setFilter(new RequestResponseLoggingFilter());
    registrationBean.addUrlPatterns("/test/*");

    return registrationBean;
  }
}

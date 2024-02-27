package com.shaunthomas999.playground.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * https://www.baeldung.com/spring-boot-add-filter
 */
@Slf4j
@Component
@Order(1)
public class TransactionFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    // Keep it empty
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;

    log.info("Starting a transaction for req : {}", req.getRequestURI());

    chain.doFilter(request, response);

    log.info("Committing a transaction for req : {}", req.getRequestURI());
  }

  @Override
  public void destroy() {
    // Keep it empty
  }
}

package com.shaunthomas999.playground.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @see <a href="https://www.baeldung.com/spring-boot-add-filter">Spring Boot Filter</a>
 */
@Slf4j
@Order(2)
public class RequestResponseLoggingFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    // Keep it empty
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    HttpServletRequest req = (HttpServletRequest) request;
    HttpServletResponse res = (HttpServletResponse) response;

    log.info("Logging Request  {} : {}", req.getMethod(), req.getRequestURI());

    chain.doFilter(request, response);

    log.info("Logging Response :{}", res.getContentType());
  }

  @Override
  public void destroy() {
    // Keep it empty
  }
}

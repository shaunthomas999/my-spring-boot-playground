package com.shaunthomas999.playground.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/")
public class SpringController {

  @Value("${com.shaunthomas999.test:on,at,all}")
  private String testValue;

  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public String home() {

    String[] testValues = testValue.split(",");

    if ((testValues.length == 1) && (testValues[0].length() < 1)) {
      log.info("Empty check");
    } else {
      log.info(":: " + testValue);
    }

    return "hello ...";
  }
}

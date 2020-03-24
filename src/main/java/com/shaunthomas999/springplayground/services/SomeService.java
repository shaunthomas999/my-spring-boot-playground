package com.shaunthomas999.springplayground.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SomeService {

  public void someMethod() {
    log.info("Result " + somePrivateMethod(230));
  }

  private boolean somePrivateMethod(int input) {
    return input % 3 == 0;
  }
}

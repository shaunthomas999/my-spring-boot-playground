package com.shaunthomas999.springplayground.model;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class SomeEnumTest {

  @Test
  void shouldConvertString() {
    log.debug("print {}", SomeEnum.A);

    assertTrue(true);
  }
}

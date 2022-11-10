package com.shaunthomas999.playground.util;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

class AssertjUtilTest {

  @Disabled
  @Test
  void purposefulFail() {
    assertThat(AssertjUtil.returnTrue())
        .as("This is supposed to fail always").isTrue();

    fail("This is purposefully failed");
  }
}

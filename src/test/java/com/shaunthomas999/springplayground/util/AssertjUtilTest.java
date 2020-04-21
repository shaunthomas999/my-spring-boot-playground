package com.shaunthomas999.springplayground.util;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

class AssertjUtilTest {

  @Disabled
  @Test
  void purposefulFail() {
    assertThat(AssertjUtil.returnTrue()).isTrue();

    fail("This is purposefully failed");
  }
}

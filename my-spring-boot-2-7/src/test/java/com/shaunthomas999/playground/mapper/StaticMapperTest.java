package com.shaunthomas999.playground.mapper;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StaticMapperTest {

  @Test
  void shouldAppendCorrectly() {
    Assertions.assertThat(StaticMapper.appendsArrows("text")).contains(">>>");
  }
}

package com.shaunthomas999.springplayground.mappers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StaticMapperTest {

  @Test
  void shouldAppendCorrectly() {
    assertThat(StaticMapper.appendsArrows("text")).contains(">>>");
  }
}

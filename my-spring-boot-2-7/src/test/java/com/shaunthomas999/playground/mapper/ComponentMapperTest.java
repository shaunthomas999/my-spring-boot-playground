package com.shaunthomas999.playground.mapper;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ComponentMapperTest {

  private ComponentMapper componentMapper;

  @BeforeEach
  void setUp() {
    componentMapper = new ComponentMapper();
  }

  @Test
  void shouldAppendCorrectly() {
    Assertions.assertThat(componentMapper.appendsArrows("text")).contains(">>>");
  }
}

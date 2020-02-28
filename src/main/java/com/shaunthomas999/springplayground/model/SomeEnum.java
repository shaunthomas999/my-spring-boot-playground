package com.shaunthomas999.springplayground.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@RequiredArgsConstructor
public enum SomeEnum {
  A("a"),
  B("b"),
  C("c"),
  ;

  private final String value;
}

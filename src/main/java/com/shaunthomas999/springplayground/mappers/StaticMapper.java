package com.shaunthomas999.springplayground.mappers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class StaticMapper {

  public static String appendsArrows(String input) {
    return input.concat(" >>>");
  }
}

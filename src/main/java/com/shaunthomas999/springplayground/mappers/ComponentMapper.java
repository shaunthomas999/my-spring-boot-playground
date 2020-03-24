package com.shaunthomas999.springplayground.mappers;

import org.springframework.stereotype.Component;

@Component
public class ComponentMapper {

  public String appendsArrows(String input) {
    return input.concat(" >>>");
  }
}

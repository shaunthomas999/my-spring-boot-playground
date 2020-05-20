package com.shaunthomas999.playground.mapper;

import org.springframework.stereotype.Component;

@Component
public class ComponentMapper {

  public String appendsArrows(String input) {
    return input.concat(" >>>");
  }
}

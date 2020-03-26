package com.shaunthomas999.springplayground.model;

import lombok.Data;

import java.util.List;

@Data
public class Product {

  private final String name;
  private final Double price;
  private final Long quantity;
  private final List<String> tags;
}

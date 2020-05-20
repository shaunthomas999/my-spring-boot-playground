package com.shaunthomas999.playground.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;

  private String name;
  private Double price;
  private Long quantity;

  @ElementCollection
  private List<String> tags;
}

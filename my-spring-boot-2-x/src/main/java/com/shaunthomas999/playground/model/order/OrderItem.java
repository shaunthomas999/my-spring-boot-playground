package com.shaunthomas999.playground.model.order;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public class OrderItem {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long orderItemId;
//  private Product product;
}

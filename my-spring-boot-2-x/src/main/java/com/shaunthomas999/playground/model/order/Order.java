package com.shaunthomas999.playground.model.order;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
public class Order {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long orderId;

  @ElementCollection
  private List<Long> orderItemId;
}

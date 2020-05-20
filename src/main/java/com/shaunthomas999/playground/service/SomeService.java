package com.shaunthomas999.playground.service;

import com.shaunthomas999.playground.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class SomeService {

  public void someMethod() {
    log.info("Result " + somePrivateMethod(230));
  }

  public List<Product> getProducts() {
    return Arrays.asList(
        new Product(1L, "milk", 1.99, 100L, Arrays.asList("Drink", "Basics")),
        new Product(2L, "bread", 0.99, 100L, Arrays.asList("Food", "Basics"))
    );
  }

  private boolean somePrivateMethod(int input) {
    return input % 3 == 0;
  }
}

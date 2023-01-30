package com.shaunthomas999.playground.service;

import com.shaunthomas999.playground.model.Product;
import com.shaunthomas999.playground.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.time.StopWatch;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Validated
@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

  public List<Product> getAllProducts() {
    var stopWatch = new StopWatch();
    stopWatch.start();

    List<Product> products = new ArrayList<>();
    productRepository.findAll().forEach(products::add);

    stopWatch.stop();
    System.out.println("Time taken for query: " + stopWatch.getTime(TimeUnit.SECONDS) + "seconds");

    return products;
  }

  /*
   TODO - 001 - Method constraint validation is not working here
   Ref: https://www.baeldung.com/javax-validation-method-constraints
   */
  public Product getProduct(@NotNull Long productId) {
    return null;
  }

  /*
   TODO - 001
   */
  public List<Product> getAllProducts(@NotNull @NotEmpty List<Long> productId) {
    return Collections.emptyList();
  }
}

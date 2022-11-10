package com.shaunthomas999.playground.service;

import com.shaunthomas999.playground.model.Product;
import com.shaunthomas999.playground.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Validated
@Service
@RequiredArgsConstructor
public class ProductService {

  private final ProductRepository productRepository;

  public List<Product> getAllProducts() {
    List<Product> products = new ArrayList<>();
    productRepository.findAll().forEach(products::add);
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

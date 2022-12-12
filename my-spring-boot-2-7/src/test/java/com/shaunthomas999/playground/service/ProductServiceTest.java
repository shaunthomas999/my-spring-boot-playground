package com.shaunthomas999.playground.service;

import com.shaunthomas999.playground.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

  @Mock
  private ProductRepository productRepository;

  @InjectMocks
  private ProductService productService;

  @Test
  void testGetProduct() {
    Assertions.assertThat(productService.getProduct(null)).isNull();
  }

  @Test
  void testGetAllProducts() {
    Assertions.assertThat(productService.getAllProducts(Collections.emptyList())).isEmpty();
  }
}

package com.shaunthomas999.playground.controller;

import com.shaunthomas999.playground.model.Product;
import com.shaunthomas999.playground.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {

  private final ProductService productService;

  @GetMapping
  public ResponseEntity<List<Product>> getProducts() {
    return ResponseEntity.ok(productService.getAllProducts());
  }

  @PostMapping
  public ResponseEntity<Void> createProduct(final @RequestBody Product product) {
    log.info("Req: {}", product);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }
}

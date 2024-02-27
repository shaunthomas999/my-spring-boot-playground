package com.shaunthomas999.playground.repository;

import com.shaunthomas999.playground.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}

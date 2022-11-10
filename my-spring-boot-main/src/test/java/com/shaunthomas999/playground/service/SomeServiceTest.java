package com.shaunthomas999.playground.service;

import com.shaunthomas999.playground.model.Product;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * ReflectionTestUtils
 */
public class SomeServiceTest {

  private SomeService someService;

  @Before
  public void setUp() throws Exception {
    someService = new SomeService();
  }

  @Test
  public void testSomePrivateMethod() {
    assertEquals(true, ReflectionTestUtils.invokeMethod(someService, "somePrivateMethod", 30));
  }

  /*
   * AssertJ - flatExtracting
   */
  @Test
  public void shouldReturnProducts() {
    List<Product> products = someService.getProducts();
    Assertions.assertThat(products)
        .flatExtracting("tags")
        .contains("Food", "Drink", "Basics");
  }
}

package com.shaunthomas999.springplayground.services;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.assertEquals;

public class SomeServiceTest {

  private SomeService someService;

  @Test
  public void testSomePrivateMethod() {
    someService = new SomeService();
    assertEquals(true, ReflectionTestUtils.invokeMethod(someService, "somePrivateMethod", 30));
  }
}

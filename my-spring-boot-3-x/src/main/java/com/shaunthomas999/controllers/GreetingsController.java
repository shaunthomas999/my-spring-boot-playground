package com.shaunthomas999.controllers;

import com.shaunthomas999.services.GreetingsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

  private final GreetingsService greetingsService;

  public GreetingsController(GreetingsService greetingsService) {
    this.greetingsService = greetingsService;
  }

  @GetMapping
  public ResponseEntity<String> getGreeting(@RequestParam String name, @RequestParam String lang) {
    return ResponseEntity.ok(greetingsService.getGreetingsText(lang) + " "+ name);
  }
}

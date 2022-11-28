package com.shaunthomas999.services;

import com.shaunthomas999.models.Greeting;
import com.shaunthomas999.repositories.GreetingsRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingsService {

  private final GreetingsRepository greetingsRepository;

  public GreetingsService(GreetingsRepository greetingsRepository) {
    this.greetingsRepository = greetingsRepository;
  }

  public String getGreetingsText(String lang) {
    Greeting greeting = greetingsRepository.findOneByLang(lang);
    return greeting.getText();
  }
}

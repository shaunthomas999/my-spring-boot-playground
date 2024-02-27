package com.shaunthomas999.repositories;

import com.shaunthomas999.models.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingsRepository extends JpaRepository<Greeting, Long> {
  Greeting findOneByLang(String lang);
}

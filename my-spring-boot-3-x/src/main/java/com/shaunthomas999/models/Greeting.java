package com.shaunthomas999.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

@Entity
public class Greeting {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private Long id;

  @NotBlank
  @Column(nullable = false)
  private String lang;

  @NotBlank
  @Column(nullable = false)
  private String text;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Greeting() {}

  public Greeting(String lang, String text) {
    this.lang = lang;
    this.text = text;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Greeting greeting = (Greeting) o;
    return lang.equals(greeting.lang) && text.equals(greeting.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, text);
  }
}

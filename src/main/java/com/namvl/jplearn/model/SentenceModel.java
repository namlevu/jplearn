package com.namvl.jplearn.model;

import java.util.List;

/**
 * SentenceModel
 */
public class SentenceModel {
  private String id;
  private List<WorldModel> words;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public List<WorldModel> getWords() {
    return words;
  }

  public void setWords(List<WorldModel> words) {
    this.words = words;
  }
  
}
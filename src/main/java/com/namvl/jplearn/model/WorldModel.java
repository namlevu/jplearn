package com.namvl.jplearn.model;

/**
 * WorldModel
 */
public class WorldModel {
  private String id;
  private String word;
  private String mean;
  private Boolean isStopWord;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public String getMean() {
    return mean;
  }

  public void setMean(String mean) {
    this.mean = mean;
  }

  public Boolean getIsStopWord() {
    return isStopWord;
  }

  public void setIsStopWord(Boolean isStopWord) {
    this.isStopWord = isStopWord;
  }

}
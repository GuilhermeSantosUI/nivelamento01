package org.unit.app.models;

public class CustomDateModel {

  private int month;
  private int day;
  private int year;

  public CustomDateModel(int month, int day, int year) {
    this.month = month;
    this.day = day;
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void displayData() {
    System.out.println(day + "/" + month + "/" + year);
  }

}

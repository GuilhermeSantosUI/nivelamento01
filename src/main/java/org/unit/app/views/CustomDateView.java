package org.unit.app.views;

import org.unit.app.models.CustomDateModel;

public class CustomDateView {

  public static void displayDateDetails(CustomDateModel date) {
    date.displayData();
  }

  public static void displayDates() {
    CustomDateModel data1 = new CustomDateModel(10, 25, 2024);
    CustomDateModel data2 = new CustomDateModel(2, 5, 2000);

    System.out.print("Data 1: ");
    displayDateDetails(data1);

    System.out.print("Data 2: ");
    displayDateDetails(data2);
  }

}

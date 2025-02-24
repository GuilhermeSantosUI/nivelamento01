package org.unit.app.views;

import org.unit.app.models.IntegerSetModel;

public class IntegerSetView {

  public static void displaySetDetails(IntegerSetModel set) {
    System.out.println(set.toSetString());
  }

  public static void displayIntegerSets() {
    IntegerSetModel set1 = new IntegerSetModel();
    IntegerSetModel set2 = new IntegerSetModel();

    set1.insertElement(10);
    set1.insertElement(20);
    set1.insertElement(30);

    set2.insertElement(20);
    set2.insertElement(30);
    set2.insertElement(40);

    System.out.println("Set 1: " + set1.toSetString());
    System.out.println("Set 2: " + set2.toSetString());

    IntegerSetModel unionSet = IntegerSetModel.union(set1, set2);
    System.out.println("União: " + unionSet.toSetString());

    IntegerSetModel intersectionSet = IntegerSetModel.intersection(set1, set2);
    System.out.println("Interseção: " + intersectionSet.toSetString());

    System.out.println("Set1 é igual a Set2? " + set1.isEqualTo(set2));

    set1.deleteElement(10);
    System.out.println("Set 1 após remoção: " + set1.toSetString());
  }

}

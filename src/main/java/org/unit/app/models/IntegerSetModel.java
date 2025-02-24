package org.unit.app.models;

public class IntegerSetModel {
  private boolean[] set;

  public IntegerSetModel() {
    set = new boolean[101];
  }

  public static IntegerSetModel union(IntegerSetModel set1, IntegerSetModel set2) {
    IntegerSetModel result = new IntegerSetModel();

    for (int i = 0; i < result.set.length; i++) {
      result.set[i] = set1.set[i] || set2.set[i];
    }

    return result;
  }

  public static IntegerSetModel intersection(IntegerSetModel set1, IntegerSetModel set2) {
    IntegerSetModel result = new IntegerSetModel();

    for (int i = 0; i < result.set.length; i++) {
      result.set[i] = set1.set[i] && set2.set[i];
    }

    return result;
  }

  public void insertElement(int k) {
    if (k >= 0 && k <= 100) {
      set[k] = true;
    }
  }

  public void deleteElement(int m) {
    if (m >= 0 && m <= 100) {
      set[m] = false;
    }
  }

  public String toSetString() {
    StringBuilder result = new StringBuilder();
    boolean isEmpty = true;

    for (int i = 0; i < set.length; i++) {
      if (set[i]) {
        result.append(i).append(" ");
        isEmpty = false;
      }
    }

    return isEmpty ? "-" : result.toString().trim();
  }

  public boolean isEqualTo(IntegerSetModel otherSet) {
    for (int i = 0; i < set.length; i++) {
      if (this.set[i] != otherSet.set[i]) {
        return false;
      }
    }

    return true;
  }

}

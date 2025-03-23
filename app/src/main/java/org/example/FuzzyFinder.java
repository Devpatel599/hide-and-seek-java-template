package org.example;

import java.util.ArrayList;

public class FuzzyFinder {

  public int linearSearch(ArrayList<Fuzzy> fuzzies) {
    for (int i = 0; i < fuzzies.size(); i++) {
      if (fuzzies.get(i).color.equals("gold")) {
        return i;
      }
    }
    return -1; // not found
  }

  public int binarySearch(ArrayList<Fuzzy> fuzzies) {
    int low = 0;
    int high = fuzzies.size() - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      String midColor = fuzzies.get(mid).color;

      int cmp = midColor.compareTo("gold");
      if (cmp == 0) {
        return mid;
      } else if (cmp < 0) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1; // not found
  }
}

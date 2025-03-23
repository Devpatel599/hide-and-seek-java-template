package org.example;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void testLinearSearchSorted() {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    ArrayList<Fuzzy> list = generator.sortedRainbowFuzzies();
    FuzzyFinder finder = new FuzzyFinder();

    int index = finder.linearSearch(list);
    assertTrue(index >= 0);
    assertEquals("gold", list.get(index).color);
  }

  @Test
  void testBinarySearchSorted() {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    ArrayList<Fuzzy> list = generator.sortedRainbowFuzzies();
    FuzzyFinder finder = new FuzzyFinder();

    int index = finder.binarySearch(list);
    assertTrue(index >= 0);
    assertEquals("gold", list.get(index).color);
  }

  @Test
  void testLinearSearchRandom() {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    ArrayList<Fuzzy> list = generator.randomizedRainbowFuzzies();
    FuzzyFinder finder = new FuzzyFinder();

    int index = finder.linearSearch(list);
    assertTrue(index >= 0);
    assertEquals("gold", list.get(index).color);
  }

  @Test
  void testBinarySearchRandom() {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    ArrayList<Fuzzy> list = generator.randomizedRainbowFuzzies();
    FuzzyFinder finder = new FuzzyFinder();

    int index = finder.binarySearch(list);
    
    if (index >= 0) {
      assertNotEquals("gold", list.get(index).color, "Binary search should not work reliably on an unsorted list.");
    }
  }
}

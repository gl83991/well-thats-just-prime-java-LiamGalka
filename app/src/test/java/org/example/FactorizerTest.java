package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList<Integer>());
  }
  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(1), new ArrayList<Integer>());
  }
  @Test
  void itReturnsAnEmptyListForNine() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(3);
    expected.add(3);
    assertEquals(factorizer.primeFactors(9), expected);
  }
  @Test
  void itReturnsAnEmptyListForTen() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(5);
    assertEquals(factorizer.primeFactors(10), expected);
  }
  @Test
  void itReturnsAnEmptyListForPrimeNumber() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(17);
    assertEquals(factorizer.primeFactors(17), expected);
  }
  @Test
  void itReturnsAnEmptyListForCompositeNumber() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(2);
    expected.add(2);
    expected.add(2);
    expected.add(3);
    assertEquals(factorizer.primeFactors(24), expected);
  }
}

package org.example;
import java.util.ArrayList;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  Factorizer factorizer = new Factorizer();

  System.out.print("Enter a number to factor: ");
  int n = scanner.nextInt();
  ArrayList<Integer> factors = factorizer.primeFactors(n);
  if (factors.isEmpty()) {
    System.out.println("No prime factors found for " + n);
  } else {
    System.out.println("Prime factors of " + n + "are: " + factors);
  }
  scanner.close();
}
}
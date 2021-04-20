package io.github.underscore11code.compsci;

import java.util.Random;
import java.util.Scanner;

public class Guess {
  public static final String[] animals = {
          "dog",
          "cat",
          "pig",
          "cow",
          "chicken"
  };

  public static void main(String[] args) {
    System.out.println("Welcome to Guess! See if you can guess my favourite animal!");
    final String animal = animals[new Random().nextInt(animals.length-1)];
    final Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("> ");
      final String in = scanner.nextLine();
      if (animal.equalsIgnoreCase(in.trim())) {
        break;
      } else {
        System.out.println("Incorrect. Try again.");
      }
    }
    scanner.close();
    System.out.println("You guessed it! Congrats!");
  }
}

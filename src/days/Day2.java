package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day2 extends Day {
  public Day2() throws FileNotFoundException {
    this.setSolution1(this.solve1());
    this.setSolution2(this.solve2());
  }

  public String solve1() throws FileNotFoundException {
    File input = new File("input_data/day2.txt");
    Scanner scanner = new Scanner(input);
    // Define counters for IDs that have 2 or 3 repeated letters
    int hasTwo = 0;
    int hasThree = 0;

    // Parse input & check for 2 or 3 repeated letters
    while (scanner.hasNextLine()) {
      String temp = scanner.nextLine();
      HashMap<Character, Integer> letterCount = new HashMap<>();

      for (int i = 0; i < temp.length(); i++) {
        // Pull character
        Character tempChar = temp.charAt(i);
        // Increment HashMap value if char is present, add 1 to data store if not
        if (letterCount.containsKey(tempChar)) {
          letterCount.replace(tempChar, letterCount.get(tempChar) + 1);
        } else {
          letterCount.put(tempChar, 1);
        }
      }

      // Increment counter variables if HashMap contains 2 or 3, respectively
      if (letterCount.containsValue(2)) {
        hasTwo++;
      }
      if (letterCount.containsValue(3)) {
        hasThree++;
      }
    }
    return String.valueOf(hasTwo * hasThree);
  }

  public String solve2() throws FileNotFoundException {
    ArrayList<String> input = this.parseInput();
    for (int i = 0; i < input.size(); i++) {
      for (int j = i + 1; j < input.size(); j++) {
        if (this.calcStringDistance(input.get(i), input.get(j)) == 1) {
          return this.stripDifferent(input.get(i), input.get(j));
        }
      }
    }
    return "Answer not found. Check your logic.";
  }

  // TODO go back and make puzzles 1-3 use this input parsing approach
  private ArrayList<String> parseInput() throws FileNotFoundException {
    ArrayList<String> output = new ArrayList<>();
    File input = new File("input_data/day2.txt");
    Scanner scanner = new Scanner(input);
    while (scanner.hasNextLine()) {
      String temp = scanner.nextLine();
      if (!temp.equals("\n")) {
        output.add(temp);
      }
    }
    return output;
  }

  /**
   * Calculates the "distance" between two strings - the number of characters different between
   * them. Returns -1 if strings are different length, although maybe it should just count each
   * additional letter as another unit of distance.
   *
   * @param string1
   * @param string2
   * @return int - distance between string1 and string2
   */
  private int calcStringDistance(String string1,  String string2) {
    // Returns -1 if strings are unequal length
    if (string1.length() != string2.length()) {
      return -1;
    }
    int stringDistance = 0;

    for (int i = 0; i < string1.length(); i++) {
      if (string1.charAt(i) != string2.charAt(i)) {
        stringDistance++;
      }
    }
    return stringDistance;
  }

  /**
   * Strips out different characters between two strings, leaving only those that are equal in both.
   *
   * @param string1
   * @param string2
   * @return String - new string containing identical characters between string1 and string2
   */
  private String stripDifferent(String string1, String string2) {
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < string1.length(); i++) {
      if (string1.charAt(i) == string2.charAt(i)) {
        output.append(string1.charAt(i));
      }
    }
    return output.toString();
  }
}

import days.*;
import java.io.FileNotFoundException;
import java.util.HashMap;

/**
 * PuzzleManager creates an instance for each day's solution (following "Day[n]" naming convention).
 * It then calls each day's solutions and stores the result in a HashMap mapping puzzle numbers to
 * a string representation of its solution.
 *
 * @author Matt Drake
 **/
class PuzzleManager {
  // Storing each puzzle solution as a string, with an Integer value indicating that puzzle's
  // chronological number.
  private HashMap<Integer, String> solutions;

  /**
   * No-arg constructor which will instantiate each day (that I've solved), run their solutions,
   * and store the answers in a HashMap.
   *
   * @throws FileNotFoundException if a day's input file is missing or corrupt
   */
  PuzzleManager() throws FileNotFoundException {
    solutions = new HashMap<>();

    Day day1 = new Day1();
    solutions.put(1, day1.getSolution1());
    solutions.put(2, day1.getSolution2());

    Day day2 = new Day2();
    solutions.put(3, day2.getSolution1());
    solutions.put(4, day2.getSolution2());
  }

  /**
   * Writes each puzzle solution to console.
   */
  void printSolutions() {
    int day;
    int puzzle;
    for (int i = 1; i < solutions.size() + 1; i++) {
      // Set day & puzzle output values based on whether the puzzle # is even or odd
      if (i % 2 != 0) {
        day = (i / 2) + 1;
        puzzle = 1;
      } else {
        day = i / 2;
        puzzle = 2;
      }

      System.out.print("Day " + day + ", Puzzle " + puzzle);
      System.out.println(" solution: " + solutions.get(i));
    }
  }
}

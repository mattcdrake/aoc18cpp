import days.*;
import java.io.FileNotFoundException;
import java.util.HashMap;

class PuzzleManager {
  // Storing each puzzle solution as a string, with an Integer value indicating that puzzle's
  // chronological number.
  private HashMap<Integer, String> solutions;

  PuzzleManager() throws FileNotFoundException {
    solutions = new HashMap<>();

    Day day1 = new Day1();
    solutions.put(1, day1.getSolution1());
    solutions.put(2, day1.getSolution2());

    Day day2 = new Day2();
    solutions.put(3, day2.getSolution1());
    solutions.put(4, day2.getSolution2());
  }

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

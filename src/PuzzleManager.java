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
  }

  void printSolutions() {
    int day;
    int puzzle;
    for (int i = 1; i < solutions.size() + 1; i++) {
      day = (i / 2) + 1;
      puzzle = (i % 2 != 0) ? 1 : 2;
      System.out.print("Day " + day + ", Puzzle " + puzzle);
      System.out.println(" solution: " + solutions.get(i));
    }
  }
}

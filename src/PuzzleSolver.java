import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

class PuzzleSolver {
  // Storing each puzzle solution as a string, with an Integer value indicating that puzzle's
  // chronological number.
  private HashMap<Integer, String> solutions;

  PuzzleSolver() throws FileNotFoundException {
    solutions = new HashMap<>();
    solutions.put(1, solve1());
  }

  private String solve1() throws FileNotFoundException {
    File inputFile = new File("input_data/day1.txt");
    Scanner inputReader = new Scanner(inputFile);
    while (inputReader.hasNextLine()) {
      System.out.println(inputReader.nextLine());
    }
    inputReader.close();
    return "we're getting somewhere";
  }

  void printPuzzleSolutions() {
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

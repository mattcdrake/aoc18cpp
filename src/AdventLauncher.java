import java.io.FileNotFoundException;

public class AdventLauncher {
  public static void main(String[] args) {
    try {
      PuzzleSolver puzzleSolver = new PuzzleSolver();
      puzzleSolver.printPuzzleSolutions();
    } catch (FileNotFoundException e) {
      System.out.println("Input data files are missing!!!");
      e.printStackTrace();
    }
  }
}

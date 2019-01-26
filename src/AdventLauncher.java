import java.io.FileNotFoundException;

public class AdventLauncher {
  public static void main(String[] args) {
    try {
      PuzzleManager puzzleManager = new PuzzleManager();
      puzzleManager.printSolutions();
    } catch (FileNotFoundException e) {
      System.out.println("Input data files are missing!!!");
      e.printStackTrace();
    }
  }
}

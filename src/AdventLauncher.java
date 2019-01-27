import java.io.FileNotFoundException;

/**
 * AdventLauncher is the driver class that creates an instance of PuzzleManager (the class that
 * runs puzzle solutions) and calls its printSolutions method.
 *
 * @author Matt Drake
 **/
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

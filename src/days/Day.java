package days;

import java.io.FileNotFoundException;

/**
 * Abstract class that will be implemented by each of the 25 days. Requires each day to have a
 * solution method for each puzzle.
 */
public abstract class Day {
  private String solution1;
  private String solution2;

  Day() {
    solution1 = "";
    solution2 = "";
  }

  public abstract String solve1() throws FileNotFoundException;
  public abstract String solve2() throws FileNotFoundException;

  /**
   * Setter for solution1
   * @param answer new value for solution1
   */
  void setSolution1(String answer) {
    this.solution1 = answer;
  }

  /**
   * Setter for solution2
   * @param answer new value for solution2
   */
  void setSolution2(String answer) {
    this.solution2 = answer;
  }

  /**
   * Getter for solution1
   * @return String solution1
   */
  public String getSolution1() {
    return this.solution1;
  }

  /**
   * Getter for solution2
   * @return String solution2
   */
  public String getSolution2() {
    return this.solution2;
  }
}

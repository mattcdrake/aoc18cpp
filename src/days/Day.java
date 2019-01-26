package days;

import java.io.FileNotFoundException;

public abstract class Day {
  private String solution1;
  private String solution2;

  Day() {
    solution1 = "";
    solution2 = "";
  }

  public abstract String solve1() throws FileNotFoundException;
  public abstract String solve2() throws FileNotFoundException;

  void setSolution1(String answer) {
    this.solution1 = answer;
  }

  void setSolution2(String answer) {
    this.solution2 = answer;
  }

  public String getSolution1() {
    return this.solution1;
  }

  public String getSolution2() {
    return this.solution2;
  }
}

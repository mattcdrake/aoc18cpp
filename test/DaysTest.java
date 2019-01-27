import days.*;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class DaysTest {

  @org.junit.jupiter.api.Test
  void solve1() {
    try {
      Day day1 = new Day1();
      String puzzle1 = day1.getSolution1();
      assertEquals("531", puzzle1);
    } catch (FileNotFoundException e) {
      System.out.println("Input data files are missing!!!");
      e.printStackTrace();
    }
  }

  @org.junit.jupiter.api.Test
  void solve2() {
    try {
      Day day1 = new Day1();
      String puzzle2 = day1.getSolution2();
      assertEquals("76787", puzzle2);
    } catch (FileNotFoundException e) {
      System.out.println("Input data files are missing!!!");
      e.printStackTrace();
    }
  }

  @org.junit.jupiter.api.Test
  void solve3() {
    try {
      Day day2 = new Day2();
      String puzzle1 = day2.getSolution1();
      assertEquals("7776", puzzle1);
    } catch (FileNotFoundException e) {
      System.out.println("Input data files are missing!!!");
      e.printStackTrace();
    }
  }

  @org.junit.jupiter.api.Test
  void solve4() {
    try {
      Day day2 = new Day2();
      String puzzle2 = day2.getSolution2();
      assertEquals("wlkigsqyfecjqqmnxaktdrhbz", puzzle2);
    } catch (FileNotFoundException e) {
      System.out.println("Input data files are missing!!!");
      e.printStackTrace();
    }
  }
}
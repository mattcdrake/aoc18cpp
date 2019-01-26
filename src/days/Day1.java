package days;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;

public class Day1 extends Day {
  public Day1() throws FileNotFoundException {
    this.setSolution1(this.solve1());
    this.setSolution2(this.solve2());
  }

  public String solve1() throws FileNotFoundException {
    File input = new File("input_data/day1.txt");
    Scanner scanner = new Scanner(input);
    int runningTotal = 0;

    while (scanner.hasNextLine()) {
      String temp = scanner.nextLine();
      if (temp.charAt(0) == '+') {
        runningTotal += Integer.parseInt(temp.substring(1));
      } else if (temp.charAt(0) == '-') {
        runningTotal -= Integer.parseInt(temp.substring(1));
      }
    }

    return String.valueOf(runningTotal);
  }

  public String solve2() throws FileNotFoundException {
    HashSet<Integer> seenFrequencies = new HashSet<>();
    File input = new File("input_data/day1.txt");
    Scanner scanner = new Scanner(input);
    String output = "";
    int runningTotal = 0;

    while (scanner.hasNextLine()) {
      String temp = scanner.nextLine();
      if (temp.charAt(0) == '+') {
        runningTotal += Integer.parseInt(temp.substring(1));
      } else if (temp.charAt(0) == '-') {
        runningTotal -= Integer.parseInt(temp.substring(1));
      }

      if (seenFrequencies.contains(runningTotal)) {
        output = String.valueOf(runningTotal);
        break;
      } else if (!temp.equals("\n")){
        seenFrequencies.add(runningTotal);
      }

      if (!scanner.hasNextLine()) {
        scanner = new Scanner(input);
      }
    }

    return output;
  }
}

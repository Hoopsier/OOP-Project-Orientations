package app;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    three();
  }

  private static void three() {
    Clock clock = Clock.getInstance();
    clock.setTime(18);
    System.out.println(clock.getTime());
  }

  private static void two() {
    final int ageDistribution[][] = {
        { 10, 19 }, { 50, 20 }, { 70, 21 }, { 80, 22 }, { 85, 23 }, { 90, 24 }, { 95, 25 }, { 100, 26 }
    };
    int size = ageDistribution.length;
    /// starts at 19 ends at 26
    int generatedAges[] = new int[size];

    for (int i = 0; i < 1000; i++) {
      int x = (int) (Math.random() * 100) + 1;
      int j = 0;
      while (x > ageDistribution[j][0]) {
        j++;
      }
      generatedAges[j]++;
    }
    // Output the result of the generation:
    System.out.println("Age  count     %-share");
    for (int age = 0; age < size; age++) {
      if (generatedAges[age] != 0) {
        String str = "%-4d %-8d %-8.2f\n";
        System.out.printf(str, age + 19, generatedAges[age], ((double) generatedAges[age]) / 1000 * 100);
      }
    }
  }
}

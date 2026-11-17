public class GradeCalculatorMichelle {

  static char letterGrade(double score) {
      if (score >= 90) {
          return 'A';
      } else if (score >= 80) {
          return 'B';
      } else if (score >= 70) {
          return 'C';
      } else if (score >= 60) {
          return 'D';
      } else {
          return 'F';
      }
  }

  static double average(double[] scores) {
      double sum = 0;
      for (double s : scores) {
          sum += s;
      }
      return sum / scores.length;
  }

  static double average(int a, int b, int c) {
      return (a + b + c)/ 3.0;
  }

  static boolean isPassing (char grade) {
      return grade != 'F';
  }

  public static void main(String[] args) {
      double[] scores = {80, 90, 70};
      double avg = average(scores);
      char grade = letterGrade(avg);
      System.out.printf("Average: %.1f, grade %c, passing: %b%n", avg, grade, isPassing(grade));

      double[] tests = {100, 90, 89.9, 80, 79.9, 70, 69.9, 60, 59.9, 0};
      for (double t : tests) {
          System.out.printf("%.1f , %c%n", t, letterGrade(t));
      }

      System.out.println(average(80, 90, 70));
  }

}
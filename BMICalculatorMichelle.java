public class BMICalculatorMichelle {
  public static void main(String[] args) {
    double weight = 70; // weight in kg
    double height = 1.75; // height in meters

    // guard: height 0 or below would break the formula
    if (height <= 0) {
      System.out.println("Height must be greater than 0.");
      return; // stop the program here
    }

    double bmi = weight / (height * height); // BMI formula
    System.out.printf("BMI: %.1f%n", bmi); // show 1 decimal

    // print the category based on the BMI value
    if (bmi < 18.5) {
      System.out.println("Underweight");
    } else if (bmi < 25) {
      System.out.println("Normal");
    } else if (bmi < 30) {
      System.out.println("Overweight");
    } else {
      System.out.println("Obese");
    }
  }
}
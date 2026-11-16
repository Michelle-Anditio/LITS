import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AboutMichelle {
    public static void main(String[] args) {
        
        String fullName = "Michelle Anditio"; // store my full name
        String hobby = "Reading"; // store my hobby
        String favoriteFood = "Nasi Goreng"; // store my favorite food

        // Print my personal information
        System.out.println("My name is: " + fullName);
        System.out.println("My hobby is: " + hobby);
        System.out.println("My favorite food is: " + favoriteFood);

        Scanner scanner = new Scanner(System.in); // scanner read user input
        System.out.println("What is your name? ");
        String name = scanner.nextLine(); // store the name typed by the user
        System.out.printf("Hello, %s!%n", name); // %s in printf replace by the name

        int age = 0; // initialize empty integer to store age
        double height = 155; // store my height
        boolean likesCoffee = false; // store whether i like coffee
        System.out.println("Height: " + height + " cm");
        System.out.println("Likes coffee: " + likesCoffee);

        System.out.print("Your age? ");  // ask for the user's age (typing letters like abc will crash the program)
        age = scanner.nextInt(); // read age as integer
        System.out.println("Age saved");
        System.out.println("Age: " + age);
        scanner.close(); // close scanner when done

        // Array: loop with for-each
        String[] hobbies = {"Reading", "Coding", "Singing"};
        for (String h : hobbies) {
            System.out.println("Hobby: " + h);
        }

        // ArrayList: add and remove items
        List<String> hobbyList = new ArrayList<>(Arrays.asList(hobbies));
        hobbyList.add("Gaming"); // add new hobby
        hobbyList.remove(0); // remove first hobby
        System.out.println("Hobbies now: " + hobbyList);
        
        // HashMap: store key-value
        Map<String, String> profile = new HashMap<>();
        profile.put("name", "Michelle");
        profile.put("city", "Medan");
        profile.put("goal", "QA Automation");
        System.out.println("Profile: " + profile);

        
    }
}
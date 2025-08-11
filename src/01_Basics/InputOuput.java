// InputOutput.java
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Taking double input
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        // Output
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");

        // Closing the scanner
        sc.close();
    }
}

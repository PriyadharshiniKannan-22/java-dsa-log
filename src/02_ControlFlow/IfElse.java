// IfElse.java
public class IfElse {
    public static void main(String[] args) {

        int number = 10;

        // Simple if-else
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Nested if-else
        int age = 20;

        if (age >= 18) {
            if (age >= 60) {
                System.out.println("You are a senior citizen.");
            } else {
                System.out.println("You are an adult.");
            }
        } else {
            System.out.println("You are a minor.");
        }
    }
}

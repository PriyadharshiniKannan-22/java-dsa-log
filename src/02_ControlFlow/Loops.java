// Loops.java
public class Loops {
    public static void main(String[] args) {

        // 1. For loop - printing numbers 1 to 5
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // 2. While loop - printing numbers 1 to 5
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // 3. Do-while loop - printing numbers 1 to 5
        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);
    }
}

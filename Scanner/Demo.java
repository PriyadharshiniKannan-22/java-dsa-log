import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = sc.nextInt();
        System.out.println("Enter a float:");
        float b = sc.nextFloat();
        System.out.println("Enter a double:");
        double c = sc.nextDouble();
        System.out.println("Enter a string:");
        String str = sc.next(); 
        System.out.println("Enter a boolean:");
        boolean bool = sc.nextBoolean();

        System.out.println("Integer: " + a);
        System.out.println("Float: " + b);      
        System.out.println("Double: " + c);
        System.out.println("String: " + str);
        System.out.println("Boolean: " + bool);
        sc.close();
    }
}

// Datatypes.java
public class Datatypes {
    public static void main(String[] args) {
        
        // Primitive Data Types
        byte smallNumber = 100;          // 1 byte
        short mediumNumber = 32000;      // 2 bytes
        int number = 100000;             // 4 bytes
        long bigNumber = 1000000000L;    // 8 bytes
        float decimalNumber = 3.14f;     // 4 bytes (single precision)
        double bigDecimal = 3.141592653; // 8 bytes (double precision)
        char letter = 'A';               // 2 bytes (Unicode)
        boolean isJavaFun = true;        // 1 bit (true/false)

        // Non-Primitive Data Type (Example: String)
        String message = "Java is awesome!";

        // Printing all data types
        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + number);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + decimalNumber);
        System.out.println("double: " + bigDecimal);
        System.out.println("char: " + letter);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + message);
    }
}

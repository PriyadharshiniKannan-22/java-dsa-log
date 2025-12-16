class TypeCasting {
    public static void main(String[] args) {
        double d = 9.78;
        int n = (int) d; // Explicit casting from double to int
        System.out.println("Double value: " + d);
        System.out.println("After casting to Integer: " + n);

        char c = 'A';
        int ascii = c;
        System.out.println("Character: " + c);
        System.out.println("ASCII value: " + ascii);
    }
}

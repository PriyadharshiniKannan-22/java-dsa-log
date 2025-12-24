class Demo {
    public static void main(String[] args) {
        int num = 1234;
        int reversed = reverseNumber(num,0);
        System.out.println("Reversed number:" + reversed);
    }

    public static int reverseNumber(int num, int reversed) {
        if (num == 0) {
            return reversed;
        }
        return reverseNumber(num/10, reversed*10 + num%10);
    }
}
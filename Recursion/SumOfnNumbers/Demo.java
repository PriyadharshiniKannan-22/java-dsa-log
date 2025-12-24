class Demo {
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfN(n);
        System.out.println(sum);
    }
    static int sumOfN(int n) {
        if (n == 1) return 1;
        return n + sumOfN(n - 1);
    }
}

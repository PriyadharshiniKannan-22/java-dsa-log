class PerfectSquare{
    public static void main(String[] args) {
        int n=64;
        int odd = 1;
        while (n > 0) {
            n -= odd;
            odd += 2;
        }  
        if (n == 0) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
}
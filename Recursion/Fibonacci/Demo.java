class Demo {
    public static void main(String[] args) {
     int n = 10;
     fibonacci(n);
   }
   static int fibonacci(int n){
     if(n <= 1) System.out.println(n + " ");
     System.out.println(fibonacci(n-1) + fibonacci(n-2));
     }
}
class NthPrime {
    public static void main(String[] args) {
        int n = 4;
        int count = 0;
        int num = 2;

        while(true){
            boolean isPrime = true;
            for(int i=2;i<=num-1;i++){
                if(num%i==0){
                    isPrime = false;
                    break;
                }
            }   

            if(isPrime){
                count++;
                if(count==n){
                    System.out.println(num);
                }
            }
            num++;
        }
    }
}

class Armstrong{
    public static void main(String[] args){
        int n = 15;
        int a = n;
        int b = n;
        int noofDigits = 0;
        while(n!=0){
            n=n/10;
            noofDigits++;
        }
        int sum = 0;
        while(a!=0){
            int digit = a%10;
            int result = 1;
            for(int i=1;i<=noofDigits;i++){
                result = result*digit;
            }
            sum = sum+result;
            a=a/10;
        }
        if(b==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
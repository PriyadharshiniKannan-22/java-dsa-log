class NoOfDigits {
    public static void main(String[] args) {
        int n = 12536;
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println("No.of Digits:" + count);
    }
}

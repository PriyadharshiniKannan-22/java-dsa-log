class Demo{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7};
        int n=arr.length+1;
        int arr_sum = 0;
        int total_sum = n*(n+1)/2;

        for(int i:arr){
            arr_sum += i;
        }
        System.out.println("The missing number is:" + (total_sum - arr_sum));
    }
}
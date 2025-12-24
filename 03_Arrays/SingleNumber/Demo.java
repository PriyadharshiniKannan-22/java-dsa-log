class Demo {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        System.out.println("The unique element in the array is:" + ans);
    }
}


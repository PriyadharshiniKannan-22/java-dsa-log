class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        func(0,arr);
    }
    static void func(int n,int[] arr){
        if(n == arr.length) return;
        System.out.println(arr[n]);
        func(n+1,arr);
    }
}


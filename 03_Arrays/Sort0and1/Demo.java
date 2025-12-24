class Demo {
    public static void main(String[] args){
        int[] arr = {0,1,0,1,1,0,0,1};
        int n = arr.length;
        int zeroCount = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroCount++;
            }
        }
        for(int i=0;i<zeroCount;i++){
            arr[i] = 0;
        }
        for(int i=zeroCount;i<n;i++){
            arr[i] = 1;
        }
        System.out.print("Sorted array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}

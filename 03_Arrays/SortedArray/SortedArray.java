class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,3,8,5};
        int tar = 8;
        int start = -1;
        int end = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                start = i;
                break;
            }
        }
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]==tar){
                end = i;
                break;
            }
        }
        System.out.println(start + " " + end);
    }
}

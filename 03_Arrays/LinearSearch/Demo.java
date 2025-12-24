class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 3;
        for(int i:arr){
            if(i==target){
                System.out.println("Target found");
                return;
            }
        }
        System.out.println("Target not found");
    }    
}

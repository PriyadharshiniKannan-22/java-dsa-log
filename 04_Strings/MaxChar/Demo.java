class Demo {
    public static void main(String[] args) {
        String str = "success";
        int count = 0;
        char result = str.charAt(0);
        for(int i=0;i<str.length();i++){
            char target = str.charAt(i);
            count = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j) == target){
                    count++;
                }
            }
            if(count > 1){
                result = target;
                break;
            }
        }
        System.out.println("The maximum occurring character is: " + result);
    }
}

class Demo {
    public static void main(String[] args) {
        String s = "This is java training      ";
        int count = 0;
        int end = s.length()-1;
        while(s.charAt(end)==' '){
            end--;
        }
        while(s.charAt(end)!=' '){
            count++;
            end--;
        }
        System.out.println("Length of last word is:" + count);
    }
}

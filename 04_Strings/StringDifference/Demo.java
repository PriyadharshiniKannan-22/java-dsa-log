class Demo {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcde";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int sum1 = 0;
        int sum2 = 0;
        for (char c : arr1) {
            sum1 += c;
        }
        for (char c : arr2) {
            sum2 += c;
        }
        System.out.println("Difference: " + (char)(sum2 - sum1));
    }
}

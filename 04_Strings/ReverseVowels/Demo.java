class Demo {
    public static void main(String[] args) {
        String str = "iceCreAm";
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (!check(arr[start])) {
                start++;
            } else if (!check(arr[end])) {
                end--;
            } else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        String result = new String(arr);
        System.out.println("String after reversing vowels: " + result);
    }

    public static boolean check(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
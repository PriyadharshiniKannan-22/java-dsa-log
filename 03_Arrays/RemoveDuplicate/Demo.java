class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        int[] unique = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (i < n - 1 && arr[i] == arr[i + 1]) {
                continue;
            }
            unique[j++] = arr[i];
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
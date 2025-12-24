class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int[] result = new int[n];
        int product = 1;

        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }

        for (int i = 0; i < n; i++) {
            result[i] = product / arr[i];
        }

        System.out.print("Product except self: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
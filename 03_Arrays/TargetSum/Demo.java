class Demo {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                System.out.println("Indices: " + i + ", " + j);
                break;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }
    }
}
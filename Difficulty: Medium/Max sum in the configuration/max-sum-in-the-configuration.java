class Solution {
    int maxSum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i * arr[i];
        }

        int max = sum;
        for (int k = 1; k < n; k++) {
            int temp = arr[n - 1];
            for (int j = n - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = temp;
            sum = 0;
            for (int i = 0; i < n; i++) {
                sum += i * arr[i];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}

class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;

        // Step 1: Place each number in its correct position
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                // Swap arr[i] and arr[arr[i]-1]
                int correctIndex = arr[i] - 1;
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Step 2: Find the first index where the number is not correct
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1; // This is the missing positive number
            }
        }

        // Step 3: If all numbers are in correct positions, missing number is n+1
        return n + 1;
    }
}

class Solution {
    public static int findEquilibrium(int arr[]) {
        int totalSum = 0;
        int leftSum = 0;

        // Step 1: find total sum of array
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // Step 2: check equilibrium point
        for (int i = 0; i < arr.length; i++) {
            totalSum = totalSum - arr[i]; // right sum

            if (leftSum == totalSum) {
                return i;   // index position
            }

            leftSum = leftSum + arr[i];
        }

        return -1;  // no equilibrium point
    }
}

// User function Template for Java

class Solution {
    public long findMaxSubarraySum(int[] arr, long k) {
        int i = 0;
        long sum = 0;
        long max = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            while (sum > k && i <= j) {
                sum -= arr[i];
                i++;
            }
            if (sum <= k) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}

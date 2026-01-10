class Solution {
    public int distinctCount(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int left = 0;
        int right = n - 1;
        int count = 0;
        int prev = Integer.MIN_VALUE; 

        while (left <= right) {
            int leftVal = Math.abs(arr[left]);
            int rightVal = Math.abs(arr[right]);
            int maxVal = Math.max(leftVal, rightVal);

            if (maxVal != prev) {
                count++;
                prev = maxVal;
            }

            if (leftVal > rightVal) {
                left++;
            } else if (rightVal > leftVal) {
                right--;
            } else { // equal
                left++;
                right--;
            }
        }

        return count;
    }
}

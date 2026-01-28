import java.util.Arrays;

class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        int n = arr.length;
        if (n < 3) return false;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            // skip duplicates
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;   // ✅ FIXED
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
}

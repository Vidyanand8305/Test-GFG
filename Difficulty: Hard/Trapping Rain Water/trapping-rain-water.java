class Solution {
    public int maxWater(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left]; // update left max
                } else {
                    water += leftMax - arr[left]; // water trapped at left
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right]; // update right max
                } else {
                    water += rightMax - arr[right]; // water trapped at right
                }
                right--;
            }
        }

        return water;
    }
}

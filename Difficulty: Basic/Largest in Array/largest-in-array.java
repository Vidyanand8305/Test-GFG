class Solution {
    public static int largest(int[] arr) {
        
        int max = arr[0];   // take first element as largest
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
}

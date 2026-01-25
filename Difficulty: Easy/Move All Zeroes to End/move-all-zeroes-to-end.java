class Solution {
    void pushZerosToEnd(int[] arr) {
        int j = 0; // index for next non-zero element

        // move all non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // fill remaining with zeros
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }
}

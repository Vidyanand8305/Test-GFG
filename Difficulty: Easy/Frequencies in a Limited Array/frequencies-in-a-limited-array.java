import java.util.*;

class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];   // frequency array

        // count frequencies
        for (int i = 0; i < n; i++) {
            freq[arr[i] - 1]++;   // convert 1-based value to 0-based index
        }

        // convert to List<Integer>
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(freq[i]);
        }

        return result;
    }
}

import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int idx = Math.abs(arr[i]) - 1;

            if (arr[idx] < 0) {
                // already visited → duplicate
                result.add(idx + 1);
            } else {
                // mark visited
                arr[idx] = -arr[idx];
            }
        }

        return result;
    }
}

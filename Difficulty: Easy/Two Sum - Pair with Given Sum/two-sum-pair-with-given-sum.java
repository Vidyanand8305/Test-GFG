import java.util.*;

class Solution {
    boolean twoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int need = target - num;

            if (set.contains(need)) {
                return true;   // pair found
            }

            set.add(num);
        }

        return false;  // no pair
    }
}

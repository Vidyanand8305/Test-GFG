import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        int maxRight = arr[n - 1];   // last element is always leader
        result.add(0, maxRight);     // add at front

        // traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(0, arr[i]);   // add at front to maintain order
            }
        }

        return result;
    }
}

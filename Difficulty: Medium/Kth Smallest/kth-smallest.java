import java.util.*;

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> m = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < arr.length; i++) {
            m.add(arr[i]);

            if (m.size() > k) {
                m.remove(); 
            }
        }

        return m.peek();
    }
}
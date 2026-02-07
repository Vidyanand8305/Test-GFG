import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> rangeSumQueries(int[] arr, int[][] queries) {
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;

        // Step 1: Prefix sum array
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        // Step 2: Process each query
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];

            if (L == 0)
                ans.add(pref[R]);
            else
                ans.add(pref[R] - pref[L - 1]);
        }

        return ans;
    }
}

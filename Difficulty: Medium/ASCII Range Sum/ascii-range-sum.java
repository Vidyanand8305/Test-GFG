class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here

        int arr[][] = new int[26][2];
        for (int i = 0; i < 26; i++) {
            arr[i][0] = -1;
            arr[i][1] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';

            int a[] = arr[idx];

            if (a[0] == -1)
                a[0] = i;
            a[1] = i;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int curr[] : arr) {
            int f = curr[0], l = curr[1];
            int sum = 0;

            for (int i = f + 1; i < l; i++) {
                sum += s.charAt(i);
            }

            if (sum != 0)
                ans.add(sum);
        }
        return ans;
    }
}

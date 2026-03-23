class Solution {
    int longestSubarrayDivK(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlength = 0;
        long sum = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            int remainder = (int)((sum % k + k) % k);

            if (map.containsKey(remainder)) {
                int len = i - map.get(remainder);
                maxlength = Math.max(maxlength, len);
            } else {
                map.put(remainder, i);
            }
        }

        return maxlength;
    }
}
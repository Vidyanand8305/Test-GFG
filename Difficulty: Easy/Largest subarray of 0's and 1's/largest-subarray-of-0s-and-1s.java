class Solution {
    int maxLen(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) arr[i] = -1; // 🔥 main trick

            sum += arr[i];

            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
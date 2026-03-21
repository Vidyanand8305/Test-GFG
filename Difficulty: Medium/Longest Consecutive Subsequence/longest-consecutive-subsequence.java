import jclass Solution {
    public int longestConsecutive(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, 1);
        }

        int max = 0;

        for (int num : map.keySet()) {
            if (!map.containsKey(num - 1)) {

                int len = 1;

                while (map.containsKey(num + len)) {
                    len++;
                }

                max = Math.max(max, len);
            }
        }

        return max;
    }
}
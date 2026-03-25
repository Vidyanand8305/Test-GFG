class Solution {
    public int countSubarray(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;

        map.put(0, 1); // important

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = -1;

            sum += arr[i];
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
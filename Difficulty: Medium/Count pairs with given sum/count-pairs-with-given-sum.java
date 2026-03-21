import javclass Solution {
    int countPairs(int arr[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

     for (int num : arr) {

           int need = target - num;
            if (map.containsKey(need)) {
                count += map.get(need);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}
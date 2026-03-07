class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) % 2 != 0){
                return key;
            }
        }
        
        return -1;
    }
}
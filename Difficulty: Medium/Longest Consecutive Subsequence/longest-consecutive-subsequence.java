import java.util.*;

class Solution {
    public int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int maxLen = 0;

        for(int num : arr){
            if(!set.contains(num - 1)){
                int curr = num;
                int count = 1;
                while(set.contains(curr + 1)){
                    curr++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}
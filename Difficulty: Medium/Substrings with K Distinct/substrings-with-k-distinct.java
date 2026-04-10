class Solution {
    private int atMostK(String s, int k) {
        int left = 0, count = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for (int right = 0; right < s.length(); right++) {
            
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            count += (right - left + 1);
        }
        
        return count;
    }
    
    public int countSubstr(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }
}
// User function Template for Java
import java.util.HashMap;

class Solution {
    char firstRep(String S) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);

            if(map.containsKey(ch)){
                int oldF = map.get(ch);
                map.put(ch, oldF + 1);
            }
            else{
                map.put(ch, 1);
            }
        }
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);

            if(map.get(ch) > 1){
                return ch;
            }
        }

        return '#';
    }
}
// User function Template for Java
class Sol {
    int getCount(String S, int N) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);

            if(i == 0 || ch != S.charAt(i-1)){   // new group
                
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                }else{
                    map.put(ch, 1);
                }
            }
        }

        int count = 0;

        for(char key : map.keySet()){
            if(map.get(key) == N){
                count++;
            }
        }

        return count;
    }
}
// User function Template for Java

class Solution {
    public long modify(long N) {
        String s = String.valueOf(N); 
        
        if(s.length() <= 1) return N; 
        
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }
        
        return Long.parseLong(sb.toString()); 
    }
}

// User function Template for Java

class Solution {
    static boolean check_duck(String N) {
        int i=0;
        int len = N.length();
        while(i<len && N.charAt(i) == '0') {
            i++;
        }
        if (i == len) return false;
    for (; i < len; i++) {
            if (N.charAt(i) == '0') {
                return true;
            }
    }
    return false;
        
    }
}
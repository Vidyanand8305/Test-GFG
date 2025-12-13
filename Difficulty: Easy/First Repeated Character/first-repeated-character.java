// User function Template for Java
class Solution {
    String firstRepChar(String s) {
         return firstrepeat(s, 0, freq);
    }
        // code here
        int[] freq =  new int[26];
     public String  firstrepeat(String s, int i, int[] freq){
         if(i==s.length()) return "-1";
         int idx = s.charAt(i) -'a';
         if(freq[idx] ==1){
             return "" +s.charAt(i);
         }
         freq[idx] =1;
         return firstrepeat(s,i+1,freq);
     }   
    
}
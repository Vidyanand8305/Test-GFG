// User function Template for Java

class Solution {
    int LastIndex(String s, char p) {
     int n = s.length();
     int idx =-1;
     for(int i=0;i<n;i++){
         if(s.charAt(i) == p) {
             idx =i;
         }
         
     }
     return idx;
   
        
    }
}

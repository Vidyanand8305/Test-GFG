// User function Template for Java

class Solution {
    ArrayList<String> pattern(String s) {
        ArrayList<String> ans =  new ArrayList<>();
        int n = s.length();
        for(int i = n;i>0;i--){
            ans.add(s.substring(0,i));
            
        }
        return ans;
       
        
    }
}
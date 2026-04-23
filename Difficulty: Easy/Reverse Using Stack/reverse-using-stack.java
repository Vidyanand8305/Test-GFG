class Solution {
    public String reverse(String S) {
         Stack<Character> s = new Stack<>();
      for(int i = 0; i<S.length();i++){
          
          s.push(S.charAt(i));
      }
      String ans  = "";
      while(!s.isEmpty()){
          ans += s.pop();
      }
      return ans;
        
    }
}
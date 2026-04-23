class Solution {
    void reverseArray(int[] arr) {
       Stack<Integer> st = new Stack<>();
       for(int i = 0;i<arr.length;i++){
           st.push(arr[i]);
           
       }
       for(int i = 0;i<arr.length;i++){
         arr[i]=  st.pop();
       }
        
    }
}

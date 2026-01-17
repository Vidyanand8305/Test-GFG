/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
     for(int num : arr ){
         int temp =num;
         int rev = 0;
         while(num>0){
             rev = rev * 10 + num %10;
             num /= 10;
         }
         
         if( rev != temp ){
             return false;
             
         }
     }
     return true;
    }
}
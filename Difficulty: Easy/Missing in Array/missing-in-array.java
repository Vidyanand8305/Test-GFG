class Solution {
    int missingNum(int arr[]) {
        int xor =  0;
        int n = arr.length+1;
        
        for(int i = 1; i<=n;i++){
            xor = xor^i;
            
        }
        for(int num:arr){
            xor = xor^num;
        }
        return xor;
    }
}
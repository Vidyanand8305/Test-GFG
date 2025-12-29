class Solution {
    public void bubbleSort(int[] arr) {
       for(int i=0;i<arr.length;i++){
           int count =0;
           for(int j=0;j<arr.length-1;j++){
               if(arr[j] >arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] =  temp;
                   count =1;
               }
               
           }
           if(count == 0) break;
       }
        
    }
}
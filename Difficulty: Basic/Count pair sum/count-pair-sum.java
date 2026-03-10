class Solution {

    static int countPairs(int arr1[], int arr2[], int x) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr2.length; i++){
            map.put(arr2[i], 1);
        }

        int count = 0;
        for(int i = 0; i < arr1.length; i++){

            int num = arr1[i];
           

            if(map.containsKey( x - num)){
                count++;
            }
        }

        return count;
    }
}
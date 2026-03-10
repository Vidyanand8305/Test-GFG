// User function Template for Java
class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        // Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans =  new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            int need = target - arr[i];
            if(map.containsKey(need)){
                ans.add(need);
                ans.add(arr[i]);
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
}
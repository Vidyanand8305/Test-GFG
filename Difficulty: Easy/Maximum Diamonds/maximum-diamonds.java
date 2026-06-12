class Solution {
    public long maxDiamonds(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : arr) {
            pq.add(x);
        }
        
        long ans = 0;
        while (k-- > 0) {
            int max = pq.poll();  
            
            ans += max;      
            
            pq.add(max / 2);     
        }
        
        return ans;
    }
}
class Solution {
    int minOperations(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }
        
        int operations = 0;
        while (pq.size() > 1 && pq.peek() < k) {
            int first = pq.poll();   
            int second = pq.poll(); 
            
            int sum = first + second;
            pq.add(sum);
            
            operations++;
        }
        if (pq.peek() < k) return -1;
        
        return operations;
    }
}
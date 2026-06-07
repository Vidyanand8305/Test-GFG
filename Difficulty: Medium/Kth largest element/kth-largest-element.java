class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
         PriorityQueue<Integer> m = new PriorityQueue<>((a, b) -> a - b);

            for (int i = 0; i < arr.length; i++) {
            m.add(arr[i]);  

            if (m.size() > k) {
                m.remove();
            }
        }

        return m.peek();
        
    }
}
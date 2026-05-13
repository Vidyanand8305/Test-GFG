class Solution {
    public static int getMaxArea(int arr[]) {
        
        int n = arr.length;
        int[] left = new int[n];  
        int[] right = new int[n]; 
        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = stack.peek();
            }
            
            stack.push(i);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = stack.peek();
            }
            
            stack.push(i);
        }

        int maxArea = 0;
        
        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
}
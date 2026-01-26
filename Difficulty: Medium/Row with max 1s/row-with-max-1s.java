// User function Template for Java
class Solution {
    public int rowWithMax1s(int arr[][]) {
        int n = arr.length;       // number of rows
        int m = arr[0].length;    // number of columns

        int row = 0;
        int col = m - 1;          // start at top-right corner
        int maxRowIndex = -1;     // to store row with maximum 1s

        while (row < n && col >= 0) {
            if (arr[row][col] == 1) {
                // Current row has more 1s, move left
                maxRowIndex = row;
                col--;
            } else {
                // Move down to next row
                row++;
            }
        }

        return maxRowIndex;
    }
}

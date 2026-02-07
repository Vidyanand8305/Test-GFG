import java.util.*;

class Solution {
    public void customSort(int phy[], int chem[], int math[], int N) {

        int[][] arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            arr[i][0] = phy[i];
            arr[i][1] = chem[i];
            arr[i][2] = math[i];
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];  
            if (a[1] != b[1])
                return b[1] - a[1];  
            return a[2] - b[2]; 
        });
        for (int i = 0; i < N; i++) {
            phy[i] = arr[i][0];
            chem[i] = arr[i][1];
            math[i] = arr[i][2];
        }
    }
}

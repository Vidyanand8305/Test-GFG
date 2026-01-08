class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
     ArrayList<Integer> list = new ArrayList<>();
     int i= 0; int j = 0;
     int n = a.length, m = b.length;
     while(i<n && j <m){
         if(a[i] == b[j]){
             if (list.size() == 0 || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
             }
             i++;
             j++;
         }
         else if (a[i] < b[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != a[i]) {
                    list.add(a[i]);
                }
                i++;
            }
             else {
                if (list.size() == 0 || list.get(list.size() - 1) != b[j]) {
                    list.add(b[j]);
                }
                j++;
            }

     } 
     while (i < n) {
            if (list.size() == 0 || list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }
         while (j < m) {
            if (list.size() == 0 || list.get(list.size() - 1) != b[j]) {
                list.add(b[j]);
            }
            j++;
        }
        return list;
     
        
    }
}

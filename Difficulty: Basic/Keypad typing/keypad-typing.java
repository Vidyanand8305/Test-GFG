// User function Template for Java
class Solution {
    // Function to find matching decimal representation of a string as on the keypad.
    public static String printNumber(String s, int n) {

        String[] keypad = {
            "2","2","2",
            "3","3","3",
            "4","4","4",
            "5","5","5",       
            "6","6","6",
            "7","7","7","7",    
            "8","8","8",       
            "9","9","9","9"     
        };

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            ans.append(keypad[s.charAt(i) - 'a']);
        }

        return ans.toString();
    }
}

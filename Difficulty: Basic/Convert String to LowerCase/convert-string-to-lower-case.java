class Solution {
    static String toLower(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Convert uppercase letters to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + ('a' - 'A'));
            }
            
            result.append(ch);
        }
        
        return result.toString();
    }
}
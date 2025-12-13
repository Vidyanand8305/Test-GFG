class Solution {
    public String reverse(String S) {
        char[] stack = new char[S.length()];
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            stack[++top] = S.charAt(i);
        }

        StringBuilder ans = new StringBuilder();
        while (top >= 0) {
            ans.append(stack[top--]);
        }

        return ans.toString();
    }
}

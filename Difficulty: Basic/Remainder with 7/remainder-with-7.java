
class Solution {

    int remainderWith7(String num) {
        return remainderWith7Rec(num, 0, 0); 
    }
    int remainderWith7Rec(String num, int i, int rem) {
        if (i == num.length()) return rem;

        int digit = num.charAt(i) - '0';
        rem = (rem * 10 + digit) % 7; 
        return remainderWith7Rec(num, i + 1, rem);
    }
}

package basic.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        //int x = 123; //input 1
        int x = -123; //input 2
        //int x = 120 //input 3

        int reverse = 0;
        while (x != 0) {
            int digit = x % 10;
            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {
                reverse = 0;
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {
                reverse = 0;
            }
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        System.out.println(reverse);
    }
}

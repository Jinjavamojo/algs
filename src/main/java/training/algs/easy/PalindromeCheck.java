package training.algs.easy;

public class PalindromeCheck {

    /**
     * Check string representing whether the string is palindrome
     * Palindrome is string that's written the same forward and backward
     *
     * @param str input
     * @return boolean, is string palindrome
     */
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}

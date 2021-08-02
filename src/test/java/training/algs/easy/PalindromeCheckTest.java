package training.algs.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeCheckTest {

    @Test
    void isPalindrome() {
        assertTrue(PalindromeCheck.isPalindrome("abcba"));
        assertTrue(PalindromeCheck.isPalindrome("abba"));
        assertFalse(PalindromeCheck.isPalindrome("abbac"));
    }
}
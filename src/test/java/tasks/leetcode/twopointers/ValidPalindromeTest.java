package tasks.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ValidPalindromeTest {
    @Test
    public void example1() {
        String input = "A man, a plan, a canal: Panama";
        boolean rsl = ValidPalindrome.isPalindrome(input);
        assertThat(rsl).isTrue();
    }

    @Test
    public void example2() {
        String input = "race a car";
        boolean rsl = ValidPalindrome.isPalindrome(input);
        assertThat(rsl).isFalse();
    }

    @Test
    public void example3() {
        String input = " ";
        boolean rsl = ValidPalindrome.isPalindrome(input);
        assertThat(rsl).isTrue();
    }
}

package tasks.leetcode.srack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ValidParenthesesTest {
    @Test
    public void example1() {
        String s = "()";
        boolean rsl = ValidParentheses.isValid(s);
        assertThat(rsl).isTrue();
    }

    @Test
    public void example2() {
        String s = "()[]{}";
        boolean rsl = ValidParentheses.isValid(s);
        assertThat(rsl).isTrue();
    }

    @Test
    public void example3() {
        String s = "(]";
        boolean rsl = ValidParentheses.isValid(s);
        assertThat(rsl).isFalse();
    }
}

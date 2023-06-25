package tasks.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ReverseWordsInAStringTest {
    @Test
    public void example1() {
        String input = "the sky is blue";
        String exp = "blue is sky the";
        String rsl = ReverseWordsInAString.reverseWords(input);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        String input = "  hello world  ";
        String exp = "world hello";
        String rsl = ReverseWordsInAString.reverseWords(input);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example3() {
        String input = "a good   example";
        String exp = "example good a";
        String rsl = ReverseWordsInAString.reverseWords(input);
        assertThat(rsl).isEqualTo(exp);
    }
}

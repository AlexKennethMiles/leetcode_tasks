package tasks.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LongestCommonPrefixTest {
    @Test
    public void exampleOne() {
        String[] input = {"flower", "flow", "flight"};
        String rsl = LongestCommonPrefix.longestCommonPrefix(input);
        String exp = "fl";
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void exampleTwo() {
        String[] input = {"dog", "racecar", "car"};
        String rsl = LongestCommonPrefix.longestCommonPrefix(input);
        String exp = "";
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void exampleThree() {
        String[] input = {""};
        String rsl = LongestCommonPrefix.longestCommonPrefix(input);
        String exp = "";
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void exampleFour() {
        String[] input = {"a"};
        String rsl = LongestCommonPrefix.longestCommonPrefix(input);
        String exp = "a";
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void exampleFive() {
        String[] input = {"", "b"};
        String rsl = LongestCommonPrefix.longestCommonPrefix(input);
        String exp = "";
        assertThat(rsl).isEqualTo(exp);
    }
}

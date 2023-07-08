package tasks.leetcode.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class WordPatternTest {
    @Test
    public void example1() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean rsl = WordPattern.wordPattern(pattern, s);
        assertThat(rsl).isTrue();
    }

    @Test
    public void example2() {
        String pattern = "abba";
        String s = "dog cat cat fish";
        boolean rsl = WordPattern.wordPattern(pattern, s);
        assertThat(rsl).isFalse();
    }

    @Test
    public void example3() {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        boolean rsl = WordPattern.wordPattern(pattern, s);
        assertThat(rsl).isFalse();
    }

    @Test
    public void case39() {
        String pattern = "abba";
        String s = "dog dog dog dog";
        boolean rsl = WordPattern.wordPattern(pattern, s);
        assertThat(rsl).isFalse();
    }
}

package tasks.leetcode.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ValidAnagramTest {
    @Test
    public void example1() {
        String s = "anagram";
        String t = "anagram";
        boolean rsl = ValidAnagram.isAnagram(s, t);
        assertThat(rsl).isTrue();
    }

    @Test
    public void example2() {
        String s = "rat";
        String t = "cat";
        boolean rsl = ValidAnagram.isAnagram(s, t);
        assertThat(rsl).isFalse();
    }

    @Test
    public void case31() {
        String s = "nl";
        String t = "cx";
        boolean rsl = ValidAnagram.isAnagram(s, t);
        assertThat(rsl).isFalse();
    }
}

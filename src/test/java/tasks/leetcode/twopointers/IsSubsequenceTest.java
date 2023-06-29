package tasks.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IsSubsequenceTest {
    @Test
    public void example1() {
        String s = "abc";
        String t = "ahbgdc";
        boolean rsl = IsSubsequence.isSubsequence(s, t);
        assertThat(rsl).isTrue();
    }

    @Test
    public void example2() {
        String s = "axc";
        String t = "ahbgdc";
        boolean rsl = IsSubsequence.isSubsequence(s, t);
        assertThat(rsl).isFalse();
    }

    @Test
    public void case10() {
        String s = "b";
        String t = "abc";
        boolean rsl = IsSubsequence.isSubsequence(s, t);
        assertThat(rsl).isTrue();
    }
}

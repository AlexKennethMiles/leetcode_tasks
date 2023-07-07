package tasks.leetcode.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class IsomorphicStringsTest {
    @Test
    public void example1() {
        String s = "egg";
        String t = "add";
        boolean rsl = IsomorphicStrings.isIsomorphic(s, t);
        assertThat(rsl).isTrue();
    }

    @Test
    public void example2() {
        String s = "foo";
        String t = "bar";
        boolean rsl = IsomorphicStrings.isIsomorphic(s, t);
        assertThat(rsl).isFalse();
    }

    @Test
    public void example3() {
        String s = "paper";
        String t = "title";
        boolean rsl = IsomorphicStrings.isIsomorphic(s, t);
        assertThat(rsl).isTrue();
    }
}

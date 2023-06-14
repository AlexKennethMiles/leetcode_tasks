package tasks.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FirstOccurrenceTest {
    @Test
    public void exampleOne() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int exp = 0;
        int rsl = FirstOccurrence.strStr(haystack, needle);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void exampleTwo() {
        String haystack = "leetcode";
        String needle = "leeto";
        int exp = -1;
        int rsl = FirstOccurrence.strStr(haystack, needle);
        assertThat(rsl).isEqualTo(exp);
    }
}

package tasks.leetcode.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    @Test
    public void example1() {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int exp = 4;
        int rsl = LongestConsecutiveSequence.longestConsecutive(nums);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int exp = 9;
        int rsl = LongestConsecutiveSequence.longestConsecutive(nums);
        assertThat(rsl).isEqualTo(exp);
    }
}

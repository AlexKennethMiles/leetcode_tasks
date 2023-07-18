package tasks.leetcode.intervals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SummaryRangesTest {
    @Test
    public void example1() {
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> exp = Arrays.asList("0->2", "4->5", "7");
        List<String> rsl = SummaryRanges.summaryRanges(nums);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> exp = Arrays.asList("0", "2->4", "6", "8->9");
        List<String> rsl = SummaryRanges.summaryRanges(nums);
        assertThat(rsl).isEqualTo(exp);
    }
}

package tasks.leetcode.intervals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MergeIntervalsTest {
    @Test
    public void example1() {
        int[][] intervals = new int[][]{
                new int[]{1, 3},
                new int[]{2, 6},
                new int[]{8, 10},
                new int[]{15, 18}
        };
        int[][] exp = new int[][]{
                new int[]{1, 6},
                new int[]{8, 10},
                new int[]{15, 18}
        };
        int[][] rsl = MergeIntervals.merge(intervals);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[][] intervals = new int[][]{
                new int[]{1, 4},
                new int[]{4, 5}
        };
        int[][] exp = new int[][]{
                new int[]{1, 5}
        };
        int[][] rsl = MergeIntervals.merge(intervals);
        assertThat(rsl).isEqualTo(exp);
    }
}

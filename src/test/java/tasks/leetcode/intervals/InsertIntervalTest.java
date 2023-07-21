package tasks.leetcode.intervals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class InsertIntervalTest {
    @Test
    public void example1() {
        int[][] intervals = new int[][]{
                {1, 3},
                {6, 9}
        };
        int[] newInterval = new int[]{2, 5};
        int[][] rsl = InsertInterval.insert(intervals, newInterval);
        int[][] exp = new int[][]{
                {1, 5},
                {6, 9}
        };
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[][] intervals = new int[][]{
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };
        int[] newInterval = new int[]{4, 8};
        int[][] rsl = InsertInterval.insert(intervals, newInterval);
        int[][] exp = new int[][]{
                {1, 2},
                {3, 10},
                {12, 16}
        };
        assertThat(rsl).isEqualTo(exp);
    }
}

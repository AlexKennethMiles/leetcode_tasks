package tasks.leetcode.intervals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BurstBalloonsTest {
    @Test
    public void example1() {
        int[][] points = new int[][]{
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}
        };
        int rsl = BurstBalloons.findMinArrowShots(points);
        int exp = 2;
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[][] points = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        int rsl = BurstBalloons.findMinArrowShots(points);
        int exp = 4;
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example3() {
        int[][] points = new int[][]{
                {-1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };
        int rsl = BurstBalloons.findMinArrowShots(points);
        int exp = 2;
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example4() {
        int[][] points = new int[][]{
                {-2147483646, -2147483645},
                {2147483646, 2147483647}
        };
        int rsl = BurstBalloons.findMinArrowShots(points);
        int exp = 2;
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void case19() {
        int[][] points = new int[][]{
                {2, 3},
                {2, 3}
        };
        int rsl = BurstBalloons.findMinArrowShots(points);
        int exp = 1;
        assertThat(rsl).isEqualTo(exp);
    }
}

package tasks.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ContainerWithMostWaterTest {
    @Test
    public void example1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int rsl = ContainerWithMostWater.maxArea(height);
        int exp = 49;
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[] height = {1, 1};
        int rsl = ContainerWithMostWater.maxArea(height);
        int exp = 1;
        assertThat(rsl).isEqualTo(exp);
    }
}

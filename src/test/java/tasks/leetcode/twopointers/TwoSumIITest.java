package tasks.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TwoSumIITest {
    @Test
    public void example1() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] rsl = TwoSumII.twoSum(numbers, target);
        int[] exp = {1, 2};
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] rsl = TwoSumII.twoSum(numbers, target);
        int[] exp = {1, 3};
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example3() {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] rsl = TwoSumII.twoSum(numbers, target);
        int[] exp = {1, 2};
        assertThat(rsl).isEqualTo(exp);
    }
}

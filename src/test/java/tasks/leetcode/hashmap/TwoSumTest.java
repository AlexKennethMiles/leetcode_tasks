package tasks.leetcode.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TwoSumTest {
    @Test
    public void example1() {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] exp = new int[]{0, 1};
        int[] rsl = TwoSum.twoSum(nums, target);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] exp = new int[]{1, 2};
        int[] rsl = TwoSum.twoSum(nums, target);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example3() {
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] exp = new int[]{0, 1};
        int[] rsl = TwoSum.twoSum(nums, target);
        assertThat(rsl).isEqualTo(exp);
    }
}

package tasks.leetcode.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ContainsDuplicateIITest {
    @Test
    public void example1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean rsl = ContainsDuplicateII.containsNearbyDuplicate(nums, k);
        assertThat(rsl).isTrue();
    }

    @Test
    public void example2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        boolean rsl = ContainsDuplicateII.containsNearbyDuplicate(nums, k);
        assertThat(rsl).isTrue();
    }

    @Test
    public void example3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean rsl = ContainsDuplicateII.containsNearbyDuplicate(nums, k);
        assertThat(rsl).isFalse();
    }
}

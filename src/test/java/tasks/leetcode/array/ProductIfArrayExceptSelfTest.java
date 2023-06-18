package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ProductIfArrayExceptSelfTest {
    @Test
    public void example1() {
        int[] input = {1, 2, 3, 4};
        int[] exp = {24, 12, 8, 6};
        int[] rsl = ProductIfArrayExceptSelf.productExceptSelf(input);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[] input = {-1, 1, 0, -3, 3};
        int[] exp = {0, 0, 9, 0, 0};
        int[] rsl = ProductIfArrayExceptSelf.productExceptSelf(input);
        assertThat(rsl).isEqualTo(exp);
    }
}

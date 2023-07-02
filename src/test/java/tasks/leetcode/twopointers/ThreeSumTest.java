package tasks.leetcode.twopointers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ThreeSumTest {
    @Test
    public void example1() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> rsl = ThreeSum.threeSum(input);
        List<List<Integer>> exp = new ArrayList<>(List.of(
                new ArrayList<>(List.of(-1, -1, 2)),
                new ArrayList<>(List.of(-1, 0, 1))
        ));
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[] input = {0, 1, 1};
        List<List<Integer>> rsl = ThreeSum.threeSum(input);
        List<List<Integer>> exp = new ArrayList<>(
                new ArrayList<>(List.of())
        );
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example3() {
        int[] input = {0, 0, 0};
        List<List<Integer>> rsl = ThreeSum.threeSum(input);
        List<List<Integer>> exp = new ArrayList<>(List.of(
                new ArrayList<>(List.of(0, 0, 0))
        ));
        assertThat(rsl).isEqualTo(exp);
    }
}

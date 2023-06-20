package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class GasStationTest {
    @Test
    public void example1() {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        int exp = 3;
        int rsl = GasStation.canCompleteCircuit(gas, cost);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void example2() {
        int[] gas = new int[]{2, 3, 4};
        int[] cost = new int[]{3, 4, 3};
        int exp = -1;
        int rsl = GasStation.canCompleteCircuit(gas, cost);
        assertThat(rsl).isEqualTo(exp);
    }
}

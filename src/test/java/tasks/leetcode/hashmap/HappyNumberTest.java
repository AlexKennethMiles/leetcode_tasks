package tasks.leetcode.hashmap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HappyNumberTest {
    @Test
    public void example1() {
        int n = 19;
        boolean rsl = HappyNumber.isHappy(n);
        assertThat(rsl).isTrue();
    }

    @Test
    public void example2() {
        int n = 2;
        boolean rsl = HappyNumber.isHappy(n);
        assertThat(rsl).isFalse();
    }
}

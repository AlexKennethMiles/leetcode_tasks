package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class JumpGameIITest {
    @Test
    public void whenTwoJumps() {
        int[] input = new int[]{2, 3, 1, 1, 4};
        int exp = 2;
        assertThat(JumpGameII.jump(input)).isEqualTo(exp);
    }

    @Test
    public void whenTwoJumpsII() {
        int[] input = new int[]{2, 3, 0, 1, 4};
        int exp = 2;
        assertThat(JumpGameII.jump(input)).isEqualTo(exp);
    }

    @Test
    public void whenOneJumps() {
        int[] input = new int[]{3, 2, 1, 0};
        int exp = 1;
        assertThat(JumpGameII.jump(input)).isEqualTo(exp);
    }

    @Test
    public void whenFourJumps() {
        int[] input = new int[]{1, 1, 1, 2, 0};
        int exp = 4;
        assertThat(JumpGameII.jump(input)).isEqualTo(exp);
    }
}

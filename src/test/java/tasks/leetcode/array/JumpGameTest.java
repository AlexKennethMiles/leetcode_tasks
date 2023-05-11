package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class JumpGameTest {
    @Test
    public void whenTrue() {
        int[] input = new int[]{2, 3, 1, 1, 4};
        assertThat(JumpGame.canJump(input)).isTrue();
    }

    @Test
    public void whenFalse() {
        int[] input = new int[]{3, 2, 1, 0, 4};
        assertThat(JumpGame.canJump(input)).isFalse();
    }
}

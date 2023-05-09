package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RotateArrayTest {
    @Test
    public void whenArray7k3() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expectedArr = new int[]{5, 6, 7, 1, 2, 3, 4};
        RotateArray.rotate(array, k);
        assertThat(expectedArr).isEqualTo(array);
    }

    @Test
    public void whenArray7kIsMinus1() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
        int k = -1;
        int[] expectedArr = new int[]{2, 3, 4, 5, 6, 7, 1};
        RotateArray.rotate(array, k);
        assertThat(expectedArr).isEqualTo(array);
    }

    @Test
    public void whenArray4k2() {
        int[] array = new int[]{-1, -100, 3, 99};
        int k = 2;
        int[] expectedArr = new int[]{3, 99, -1, -100};
        RotateArray.rotate(array, k);
        assertThat(expectedArr).isEqualTo(array);
    }
}

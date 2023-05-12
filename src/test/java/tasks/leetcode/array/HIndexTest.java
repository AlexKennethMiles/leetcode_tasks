package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HIndexTest {
    @Test
    public void whenHIndexEqualsThreeWithFifeArticles() {
        int[] citations = new int[]{3, 0, 6, 1, 5};
        int exp = 3;
        assertThat(HIndex.hIndex(citations)).isEqualTo(exp);
    }

    @Test
    public void whenHIndexEqualsOneWithThreeArticles() {
        int[] citations = new int[]{1, 3, 1};
        int exp = 1;
        assertThat(HIndex.hIndex(citations)).isEqualTo(exp);
    }

    @Test
    public void whenHIndexEqualsThreeWithThreeArticles() {
        int[] citations = new int[]{3, 3, 3};
        int exp = 3;
        assertThat(HIndex.hIndex(citations)).isEqualTo(exp);
    }

    @Test
    public void whenHIndexEqualsZeroWithFiftyArticles() {
        int[] citations = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int exp = 0;
        assertThat(HIndex.hIndex(citations)).isEqualTo(exp);
    }
}

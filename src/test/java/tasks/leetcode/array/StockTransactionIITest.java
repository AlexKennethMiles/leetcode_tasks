package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StockTransactionIITest {
    @Test
    public void whenMaxProfitIsSeven() {
        int[] input = new int[]{7, 1, 5, 3, 6, 4};
        int exp = 7;
        assertThat(StockTransactionII.maxProfit(input)).isEqualTo(exp);
    }

    @Test
    public void whenMaxProfitIsFour() {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int exp = 4;
        assertThat(StockTransactionII.maxProfit(input)).isEqualTo(exp);
    }

    @Test
    public void whenMaxProfitIsTwelve() {
        int[] input = new int[]{1, 7, 1, 2, 7};
        int exp = 12;
        assertThat(StockTransactionII.maxProfit(input)).isEqualTo(exp);
    }

    @Test
    public void whenNoMaxProfit() {
        int[] input = new int[]{7, 6, 4, 3, 1};
        int exp = 0;
        assertThat(StockTransactionII.maxProfit(input)).isEqualTo(exp);
    }
}

package tasks.leetcode.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class StockTransactionTest {
    @Test
    public void whenMaxProfitIsFive() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int exp = 5;
        assertThat(StockTransaction.maxProfit(prices)).isEqualTo(exp);
    }

    @Test
    public void whenNoMaxProfit() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int exp = 0;
        assertThat(StockTransaction.maxProfit(prices)).isEqualTo(exp);
    }
}

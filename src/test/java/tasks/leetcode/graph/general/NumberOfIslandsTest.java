package tasks.leetcode.graph.general;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class NumberOfIslandsTest {
    private final NumberOfIslands numberOfIslands = new NumberOfIslands();

    @Test
    public void example1() {
        char[][] input = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int exp = 1;
        int res = numberOfIslands.numIslands(input);
        assertThat(exp).isEqualTo(res);
    }

    @Test
    public void example2() {
        char[][] input = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        int exp = 3;
        int res = numberOfIslands.numIslands(input);
        assertThat(exp).isEqualTo(res);
    }
}

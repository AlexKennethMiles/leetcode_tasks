package tasks.leetcode.graph.general;

/**
 * Задача про острова.
 * Рекурсивный метод, который гарантированно затерает остров.
 * При дальнейшей итерации повторно не считается.
 * Так достигается уникальность и корректность счётчика.
 */
public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int islands = 0;
        if (grid.length == 0) {
            return 0;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    check(grid, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void check(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        check(grid, i - 1, j);
        check(grid, i, j - 1);
        check(grid, i, j + 1);
        check(grid, i + 1, j);
    }
}



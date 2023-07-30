package tasks.leetcode.binarytree.general;

/**
 * === Рекурсивный обход графа снизу ===
 */
public class MaximumDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) { // Если дошли до конечной Node
            return 0; // Начинаем считать вверх
        }
        int leftMaxDepth = maxDepth(root.left); // Рекурсивный вызов для левой ветви
        int rightMaxDepth = maxDepth(root.right); // Рекурсивный вызов для правой ветви
        return Math.max(leftMaxDepth, rightMaxDepth) + 1; // Выбираем большую глубину и движемся вверх
    }
}

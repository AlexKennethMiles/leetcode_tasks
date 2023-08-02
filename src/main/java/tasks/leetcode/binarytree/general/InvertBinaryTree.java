package tasks.leetcode.binarytree.general;

/**
 * === Поиск в глубину (рекурсия)  ===
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        // Если упёрлись в конец графа
        if (root == null) {
            return null;
        }
        // Запускаем рекурсию для левой и правой ветви узла
        invertTree(root.left);
        invertTree(root.right);
        // Меняем местами левую и правую ветви
        final TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        return root;
    }
}

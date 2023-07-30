package tasks.leetcode.binarytree.general;

/**
 * === Рекурсивный обход графов сверху ===
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Если обе Node == null
        if (p == null && q == null) {
            return true;
        }
        // Если ода из Node == null или у них разные значения
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // Рекурсивно вызываем метод для левой и правой ветви
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

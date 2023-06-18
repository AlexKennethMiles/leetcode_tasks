package tasks.leetcode.array;

/**
 * Суть алгоритма:
 * 1. Вспомогательный массив
 * 2. Временная переменная
 * Исходный:        1,  2, 3, 4
 * ============================
 * Проход слева:    1,  1, 2, 6
 * Проход справа:  24, 12, 4, 1
 * ============================
 * Результирующий: 24, 12, 8, 6
 * <p>
 * Проходы слева и справа отражают перемножение
 * с начала (лева или права) и до конкретного элемента, например:
 * Для прохода справа 24 получилось так: 4*1 + 3*4 + 2*12 = 24
 */
public class ProductIfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] rsl = new int[nums.length];
        for (int i = 0, temp = 1; i < nums.length; i++) {
            rsl[i] = temp;
            temp *= nums[i];
        }
        for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
            rsl[i] *= temp;
            temp *= nums[i];
        }
        return rsl;
    }
}

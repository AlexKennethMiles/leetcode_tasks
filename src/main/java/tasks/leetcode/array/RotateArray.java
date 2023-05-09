package tasks.leetcode.array;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        // Убираем избыточные итерации
        k = k % nums.length;
        // Если k отрицательно, то:
        // nums.length = 7, k = -1,  тоже самое, что и
        // nums.length = 7, k = 6, то есть:
        if (k < 0) {
            k += nums.length;
        }
        // Первая часть
        reverse(nums, 0, nums.length - k - 1);
        // Вторая часть
        reverse(nums, nums.length - k, nums.length - 1);
        // Общая перестановка
        reverse(nums, 0, nums.length - 1);
    }

    private static void reverse(int[] nums, int i, int j) {
        int li = i;
        int ri = j;
        int temp;
        while (li < ri) {
            temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            li++;
            ri--;
        }
    }
}

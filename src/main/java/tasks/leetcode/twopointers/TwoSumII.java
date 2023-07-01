package tasks.leetcode.twopointers;

/**
 * 1. Массив отсортирован
 * 2. Указатель на левый и правый край массива
 * 3. Пока не нашли пару для target:
 * 3.1. Если сумма меньше target, сдвигаем левый указатель вправо [left++]
 * 3.2. Если сумма больше target, сдвигаем правый указатель влево [right--]
 */
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}

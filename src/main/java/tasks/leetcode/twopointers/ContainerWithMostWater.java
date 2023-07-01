package tasks.leetcode.twopointers;

/**
 * 1. Два указателя на левый и правый край
 * 2. Обновляем максимальную площадь, если нужно
 * 3. Сдвигаем указатель, по которому меньшая высота (т.к. от неё зависит площадь)
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxAmount = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                maxAmount = Math.max(maxAmount, height[left] * (right - left));
                left++;
            } else {
                maxAmount = Math.max(maxAmount, height[right] * (right - left));
                right--;
            }
        }
        return maxAmount;
    }
}

package tasks.leetcode.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * === Set, находим наименьшее, и далее шагаем +1 ===
 */
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        // Инициализируем Set
        Set<Integer> numberSet = new HashSet<>();
        for (int num : nums) {
            numberSet.add(num);
        }
        int max = 0; // Начинаем с нуля
        // Проходим весь Set
        for (int num : numberSet) {
            // Находим самое маленькое число Set
            if (!numberSet.contains(num - 1)) { // У него не должно быть числа меньше в Set
                int currNum = num;
                int currStreak = 1;
                // Пока в Set находим числа последовательности вправо
                while (numberSet.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }
                // Обновляем максимум при необходимости
                max = Math.max(max, currStreak);
            }
        }
        return max;
    }
}

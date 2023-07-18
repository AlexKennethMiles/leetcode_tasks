package tasks.leetcode.intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * === Проходим fori, Проскальзываем inner while ===
 */
public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> rsl = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < nums.length // Пока в пределах массива
                    && nums[i] + 1 == nums[i + 1]) { // И след. элемент на 1 больше пред-го
                i++; // Итерируемся по массиву
            }
            // Если здесь, значит интервал прервался
            if (start != nums[i]) { // Если начало отличается от конца
                rsl.add(String.valueOf(start)
                        .concat("->")
                        .concat(
                                String.valueOf(nums[i])
                        ));
            } else { // Если начало совпадает с концом
                rsl.add(String.valueOf(start));
            }
        }
        return rsl;
    }
}

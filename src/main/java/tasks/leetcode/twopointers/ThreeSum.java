package tasks.leetcode.twopointers;

import java.util.*;

/**
 * 0. Сортировка массива перед анализом
 * 1. Два (по-сути три) указателя:
 * 1.1. Первый [i] проходит прямо от начала и до конца массива
 * 1.2. Второй [j] проходит прямо с i+1 до конца
 * 1.3. Третий [k] проходит обратно с nums.length-1
 * 2. Два цикла:
 * 2.1. nums.fori для прохода первого указателя
 * 2.2. while(j<k) для обхода вариантов в границах [i+1; nums.length-1]
 * 3. Итерация сдвигает границы поиска триплетов:
 * 3.1. Для nums.fori относительно i
 * 3.2. Для while(j<k) относительно j и k, отталкиваясь от curSum
 * 3.2.1. Если curSum<0 значит левая граница [j] перевешивает в минус и потому j+1 (увеличивается значение)
 * 3.2.2. Если curSum>0 значит правая граница [k] перевешивает в плюс и потому k-1 (уменьшает значение)
 * 4. Собираем в Set<List<Integer>> для обеспечения уникальности триплетов
 * 5. Переводим Set в искомый List<List<Integer>>
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> rsl = new ArrayList<>(new ArrayList<>());
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                curSum = nums[i] + nums[j] + nums[k];
                if (curSum == 0) {
                    set.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
                    j++;
                    k--;
                } else if (curSum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        rsl.addAll(set);
        return rsl;
    }
}

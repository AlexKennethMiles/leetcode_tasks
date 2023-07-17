package tasks.leetcode.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * === Мапа и расстояние между значениями по индексу ===
 * +++ Оптимизация HashSet +++
 * +=+ Либо HashMap заданной размерности nums.length
 */
public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int slideWindow = 0;
        for (int i = 0; i < nums.length; i++) {
            // Если не можем добавить, значит нашли дубликат в пределах k
            if (!set.add(nums[i])) {
                return true;
            }
            // Если Set стал больше допустимого расстояния
            if (set.size() > k) {
                // Сдвигаем окно на один вправо, удаляя из Set с начала элементы
                set.remove(nums[slideWindow++]);
            }
        }
        return false;
    }
}

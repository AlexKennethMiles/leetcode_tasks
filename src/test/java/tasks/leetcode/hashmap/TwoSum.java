package tasks.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * === Сопоставление по HashMap ===
 * 1. Кладём в map'у, если для текущего эл-та нет пары для target
 * 2. Возвращаем пару индексов в ином случае
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

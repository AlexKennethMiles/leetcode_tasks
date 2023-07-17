package tasks.leetcode.hashmap;

import java.util.HashSet;

/**
 * === Set ===
 * Храним в сете получившиеся суммы, пока:
 * 1. Не замкнётся бесконечный цикл
 * 2. Или не найдём число
 */
public class HappyNumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            n = sum;
        }
        return true;
    }
}

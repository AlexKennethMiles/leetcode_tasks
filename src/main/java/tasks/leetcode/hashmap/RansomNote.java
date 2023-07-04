package tasks.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * === Простое решение через HashMap ===
 * 1. Создаём HashMap (dict) для хранения частоты символов из magazine
 * 2. Проходим по ransomNote сопоставляя с dict:
 * 2.1. Если есть в dict и частота > 0, то увеличиваем count и вычитаем частоту из словаря по этому символу
 * 2.2. Если нет, то значит и не будет => return false
 * 3. Если не упали в 2.2. то, сверяем count c ransomNote.length
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> dict = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            if (dict.containsKey(c)) {
                dict.put(c, dict.get(c) + 1);
            } else {
                dict.put(c, 1);
            }
        }
        int count = 0;
        for (char c : ransomNote.toCharArray()) {
            if (dict.containsKey(c) && dict.get(c) > 0) {
                dict.put(c, dict.get(c) - 1);
                count++;
            } else {
                break;
            }
        }
        return count == ransomNote.length();
    }
}

package tasks.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * === Карта сопоставления ===
 * Возвращаем false, когда:
 * 1. Текущего ключа нет в карте, а значение есть
 * 2. Текущий ключ есть, но сопоставлен не с текущим словом
 */
public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Integer, String> map = new HashMap<>();
        char[] letters = pattern.toCharArray();
        String[] words = s.split(" ");
        if (letters.length != words.length) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey((int) letters[i])
                    && !map.containsValue(words[i])) {
                map.put((int) letters[i], words[i]);
            } else if (!map.containsKey((int) letters[i])
                    && map.containsValue(words[i])) {
                return false;
            } else if (!map.get((int) letters[i]).equals(words[i])) {
                return false;
            }
        }
        return true;
    }
}

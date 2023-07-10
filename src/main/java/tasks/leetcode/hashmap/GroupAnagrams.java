package tasks.leetcode.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * === Карта сопоставления ===
 * 1. Ключом будет отсортированный массив символов
 * 2. Вместо Arrays.sort() используй массив заполнение chars[26] через коды ASCII
 * 3. После формирования chars[26] преобразуй их в String и используй как key
 * 4. Если ключа ещё нет в map, инициализируй под него вложенный массив
 */
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = new char[26];
            for (char c : str.toCharArray()) {
                chars[c - 'a']++;
            }
            String key = String.valueOf(chars);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

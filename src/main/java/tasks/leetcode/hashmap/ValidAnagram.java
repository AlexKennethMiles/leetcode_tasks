package tasks.leetcode.hashmap;

/**
 * === Массив сопоставления ===
 * 1. Создаём массив - в нём количество символов:
 * 1.1. char из слова s => count[sChar]++
 * 1.2. char из слова t => count[tChar]--
 * 2. Если в итоге хотя бы один char из массива count не уравнялся (равен нулю),
 * значит не анаграмма
 */
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            count[sChars[i] - 97]++;
            count[tChars[i] - 97]--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}

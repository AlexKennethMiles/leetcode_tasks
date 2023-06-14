package tasks.leetcode.string;

/**
 * Суть алгоритма:
 * 1. Берём первое слово = prefix
 * 2. Проходим массив строк
 * 3. "Откусываем" от prefix по символу,
 * пока indexOf не даст полного совпадения
 * 4. Возвращаем остаток от prefix
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int index = 1; index < strs.length; index++) {
            while (strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}

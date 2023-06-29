package tasks.leetcode.twopointers;

/**
 * 1. Переводим в массивы символов
 * 2. При совпадении сдвигаем указатели [i] подпоследовательности (sChars) и [j]
 * 3. При расхождении только указатель [j] основных символов (tChars)
 * 4.1. Если [i] достиг длины подпоследовательности, она валидна
 * 4.2. Иначе подпоследовательность не актуальна
 */
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        int sLen = s.length();
        int tLen = t.length();
        int i = 0;
        int j = 0;

        if (sLen < 1) {
            return true;
        }

        while (j < tLen) {
            if (sChars[i] == tChars[j]) {
                i++;
            }
            j++;
            if (i == sLen) {
                return true;
            }
        }

        return false;
    }
}

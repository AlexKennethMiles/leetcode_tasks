package tasks.leetcode.string;

/**
 * Суть алгоритма:
 * 1. Убрать пробелы (самое главное - в конце)
 * 2. Начать цикл с конца и выйти, как только наткнёмся на пробел
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int a = 0;
        s = s.trim();
        int b = s.length() - 1;
        while (b >= 0 && s.charAt(b) != ' ') {
            a++;
            b--;
        }
        return a;
    }
}

package tasks.leetcode.string;

/**
 * 1. Убираем пробелы в начале и конце
 * 2. Split'им по пробелу в String[]
 * 3. Собираем в rsl в обратном порядке, пропуская пустые эелменты
 */
public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder rsl = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].equals("")) {
                rsl.append(words[i]).append(" ");
            }
        }
        return rsl.toString().trim();
    }
}

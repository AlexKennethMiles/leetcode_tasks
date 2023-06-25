package tasks.leetcode.array;

/**
 * Суть в сопоставлении числа строке.
 * Вычитаем из входного числа максимально допустимое значение,
 * параллельно записывая римскую цифру-сопоставление числу, которое вычитаем.
 * И так пока num не станет равно нулю.
 */
public class IntegerToRoman {
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }

        return sb.toString();
    }
}
package tasks.leetcode.array;

/**
 * Используем массивы строк-сопоставления:
 * 1. от 1 до 9
 * 2. от 10 до 90
 * И далее рекурсивно разбиваем число на составные
 * миллионы, тысячи, сотни, десятки и единицы.
 */
public class IntegerToEnglishWords {
    private final String[] lessThan10 = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = new String[]{"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return handle(num);
    }

    private String handle(int num) {
        StringBuilder sb = new StringBuilder();
        if (num < 20) {
            sb.append(lessThan10[num]);
        } else if (num < 100) {
            sb.append(tens[num / 10]).append(" ").append(handle(num % 10));
        } else if (num < 1_000) {
            sb.append(handle(num / 100)).append(" Hundred ").append(handle(num % 100));
        } else if (num < 1_000_000) {
            sb.append(handle(num / 1_000)).append(" Thousand ").append(handle(num % 1_000));
        } else if (num < 1_000_000_000) {
            sb.append(handle(num / 1_000_000)).append(" Million ").append(handle(num % 1_000_000));
        } else {
            sb.append(handle(num / 1_000_000_000)).append(" Billion ").append(handle(num % 1_000_000_000));
        }
        return sb.toString().trim();
    }
}

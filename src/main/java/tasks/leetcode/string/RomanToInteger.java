package tasks.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Суть алгоритмов:
 * 1. Замена идентичной "неправильной", но простой записью.
 * 2. Через предыдущее значение прямым проходом.
 * 3. Через текущее значение умножить на 4 обратным проходом.
 */
public class RomanToInteger {
    public static int replaceRomanToInt(String s) {
        int rsl = 0;
        s = s.replace("IV", "IIII").replace("IX", "VIIII");
        s = s.replace("XL", "XXXX").replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC");
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    rsl += 1;
                    break;
                case 'V':
                    rsl += 5;
                    break;
                case 'X':
                    rsl += 10;
                    break;
                case 'L':
                    rsl += 50;
                    break;
                case 'C':
                    rsl += 100;
                    break;
                case 'D':
                    rsl += 500;
                    break;
                case 'M':
                    rsl += 1000;
                    break;
                default:
                    break;
            }
        }
        return rsl;
    }

    public static int previousRomanToInt(String s) {
        int rsl = 0, prev = 0, num = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
                default:
                    break;
            }
            if (num > prev) {
                rsl -= prev;
                rsl += num - prev;
            } else {
                rsl += num;
            }
            prev = num;
        }
        return rsl;
    }

    public static int currMultiplyFourRomanToInt(String s) {
        int rsl = 0;
        Map<Character, Integer> nums = new HashMap<>();
        nums.put('M', 1000);
        nums.put('D', 500);
        nums.put('C', 100);
        nums.put('L', 50);
        nums.put('X', 10);
        nums.put('V', 5);
        nums.put('I', 1);
        int digit;
        for (int i = s.length() - 1; i >= 0; i--) {
            digit = nums.get(s.charAt(i));
            if (4 * digit < rsl) {
                rsl -= digit;
            } else {
                rsl += digit;
            }
        }
        return rsl;
    }
}

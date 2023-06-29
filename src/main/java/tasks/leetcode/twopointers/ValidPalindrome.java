package tasks.leetcode.twopointers;

/**
 * 1. Два указателя
 * 2. Идём слева, пока не найдём букву
 * 3. Идём справа, пока не найдём букву
 * 4. Сравниваем буквы:
 *     4.1. Если равны, то увеличиваем левый указатель и уменьшаем правый
 *     4.2. Если не равны, значит не палиндром
 * 5. Если дошли указатели сравнялись, значит палиндром
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left))
                        != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

package tasks.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * === Простое решение через HashMap ===
 * 1. Создаём HashMap (dict) для хранения частоты символов из magazine
 * 2. Проходим по ransomNote сопоставляя с dict:
 * 2.1. Если есть в dict и частота > 0, то увеличиваем count и вычитаем частоту из словаря по этому символу
 * 2.2. Если нет, то значит и не будет => return false
 * 3. Если не упали в 2.2. то, сверяем count c ransomNote.length
 * <p>
 * === ОПТИМИЗАЦИЯ ASCII ===
 * 1. Создаём фиксированный словарь на 26 строчных английских букв (условие задачи)
 * 2. Вычитая из символа 'a' (int ~ 97) можно получить позицию в dict
 * 3. Проходим magazine и инкрементируем в dict соотв. позицию
 * 4. Проходим ransomNote и декрементируем в dict соотв. позицию
 * 5. Если по позиции образуется минус, значит в magazine не хватает символов, иначе true
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] dict = new int[26];
        for (char c : magazine.toCharArray()) {
            dict[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (--dict[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}

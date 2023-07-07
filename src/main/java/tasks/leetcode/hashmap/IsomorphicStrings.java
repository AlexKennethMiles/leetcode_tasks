package tasks.leetcode.hashmap;

/**
 * === Две мапы сопоставления ===
 * 1. Читаем символы из двух строк одновременно
 * 2. Сопоставляем один символ другому, если для них (обоих одновременно)
 * не было сопоставления (значения по индексу символа == 0)
 * 3. Иначе нарушается правило сопоставления и строки не являются изоморфными
 * т.к. либо sChar уже сопоставлен другой tChar, либо наоборот для tChar аналогично
 * P.S. Используется неявное приведение типов
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (map1[sChar] == 0 && map2[tChar] == 0) {
                map1[sChar] = tChar;
                map2[tChar] = sChar;
            } else if (map1[sChar] != tChar) {
                return false;
            }
        }
        return true;
    }
}

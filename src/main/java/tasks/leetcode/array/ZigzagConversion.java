package tasks.leetcode.array;

/**
 * 1. Двумерный массив StringBuilder
 * 2. Шаблон зигзага:
 *    2.1 Движение вниз, пока не упрёмся в дно (numRows)
 *    2.2 Движение вверх, пока не упрёмся в след. итерацию, начиная с [numRows-2]
 * 3. Сбор получившейся строки
 * Пример наглядного представления:
 *  P    | A    | H    | N
 *  A  P | L  S | I  I | G
 *  Y    | I    | R    |
 */
public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        if (numRows == 1) { // Проверка единичного символа
            return s; // Сразу возвращаем строку
        }

        StringBuilder[] sbs = new StringBuilder[numRows]; // Массив строк
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder(); // Инициализируем строки массива (второе измерение)
        }

        char[] chars = s.toCharArray(); // Массив символов для перебора
        int n = chars.length; // Длина массива символов
        int index = 0; // Индекс текущего символа массива
        while (index < n) { // пока не упрёмся в последний символ, повторяем шаблон зигзага
            // Движение вниз
            for (int j = 0; j < numRows && index < n; j++) { // Пока не упрёмся в дно
                sbs[j].append(chars[index++]); // Добавляем в соотв. и увеличиваем index
                // Указатель цикла увеличиваем
            }
            // Движение вверх
            for (int j = numRows - 2; j > 0 && index < n; j--) { // Пока не упрёмся в след вертикаль
                sbs[j].append(chars[index++]); // Добавляем в соотв. и увеличиваем index
                // Указатель цикла уменьшаем
            }
        }

        // Сборка искомой строки
        StringBuilder rsl = new StringBuilder();
        for (StringBuilder sb : sbs) {
            rsl.append(sb);
        }

        return rsl.toString();
    }
}

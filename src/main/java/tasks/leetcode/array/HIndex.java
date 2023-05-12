package tasks.leetcode.array;

public class HIndex {
    public static int hIndex(int[] citations) {
        // Создаём массив для подсчёта кол-ва статей, которые цитировались X раз.
        // Дополнительные 2 ячейки нужны для ситуации, когда:
        // citations[0]                  -> Индекс Хирша == 0;
        // citations[citations.length+2] -> Для корректной работы поиска максимального Индекса.
        // (чтобы не писать отдельный if для обработки первой итерации)
        // Индекс Хирша не может быть больше кол-ва статей.
        int[] counts = new int[citations.length + 2];

        // Проходим массив с последнего элемента
        for (int i = citations.length - 1; i >= 0; i--) {
            // Сначала определяем позицию, в которую пойдёт инкремент:
            // если цитируемость статьи меньше кол-ва статей, то
            // инкрементируем позицию citations[i], и получится:
            // citations   [1,3,1]
            // counts    [0,2,1,0,0]
            counts[Math.min(citations[i], citations.length)]++;
        }

        int h;
        // Определяем максимально возможный индекс Хирша для входного массива
        // и начинаем обратный обход, чтобы найти фактический максимальны индекс.
        for (h = citations.length; h > 0; h--) {
            // Каждый раз снижая индекс Хирша,
            // мы прибавляем количество более цитируемых статей
            counts[h] += counts[h + 1];
            // Если количество статей индекса равна ему, то выходим из цикла
            if (counts[h] >= h) {
                break;
            }
        }
        return h;
    }
}

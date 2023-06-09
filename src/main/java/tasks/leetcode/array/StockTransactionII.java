package tasks.leetcode.array;

/**
 * Смысл алгоритма в том, что максимальная прибыль будет получена всегда,
 * если цена за текущий день больше предыдущей цены. Сделки заключается
 * всегда, когда выполняется условие prices[i - 1] < prices[i].
 * НЕ существует случаев, когда это условие НЕ приведёт к максимальной прибыли,
 * в контексте данной задачи.
 */
public class StockTransactionII {
    public static int maxProfit(int[] prices) {
        if (prices.length == 1) { // Если только один день, то нет выгоды (меньше дня не может быть)
            return 0;
        }
        if (prices.length == 2) { // Если только два дня, то
            if (prices[1] > prices[0]) { // Если во второй день цена больше
                return prices[1] - prices[0]; // Возвращаем единственно возможную выгоду
            }
        }
        int totalProfit = 0; // Общая выгода сессии транзакций
        for (int i = 1; i < prices.length; i++) { // Начинаем со второго дня (смотрим в прошлое)
            if (prices[i - 1] < prices[i]) { // Если текущая цена больше предыдущей, то заключаем сделку
                totalProfit += prices[i] - prices[i - 1]; // Прибавляем выгоду в общий счёт
            }
        }
        return totalProfit;
    }
}

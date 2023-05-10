package tasks.leetcode.array;

public class StockTransaction {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Для минимума отталкиваемся от потолка
        int maxProf = 0; // Искомый максимум прибыли
        int dailyProf; // Прибыль по сделке в конкретный день
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) { // Если нашли минимальную цену
                minPrice = prices[i]; // Обновляем переменную
            }
            dailyProf = prices[i] - minPrice; // Высчитываем прибыль сделки конкретного дня (день в день будет 0)
            if (maxProf < dailyProf) { // Если сделка в данный день выгоднее предыдущей
                maxProf = dailyProf; // Обновляем переменную, делая её приоритетной
            }
        }
        return maxProf;
    }
}

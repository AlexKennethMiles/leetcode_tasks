package tasks.leetcode.backtracking;

/**
 * Обратный поиск - Backtracking
 */
public class FairDistributionOfCookies {
    private int ans; // Храним ответ (отталкиваемся от максимального -> стремимся к минимальному)
    private int[] count; // Варианты распределения

    private void backtrack(int cookieNo, int k, int[] cookies) {
        if (cookieNo == cookies.length) { // Если дошли до последнего крайнего варианта распределения
            // Находим максимальное кол-во печенья у k-детей
            int max = 0;
            for (int i = 0; i < k; i++) {
                max = Math.max(max, count[i]);
            }
            ans = Math.min(ans, max); // Ответ равен минимально возможному максимальной несправедливости
            // Например, для count {31, 30} ans будет 31
            // Отталкиваемся от Integer.MAX_VALUE
            return;
        }

        for (int i = 0; i < k; i++) { // Распределяем печенье по детям
            count[i] += cookies[cookieNo]; // Сначала складываем всё у первого ребёнка, потом перекладываем ко второму и т.д.
            backtrack(cookieNo + 1, k, cookies); // Рекурсивно вызываем обратный поиск
            count[i] -= cookies[cookieNo]; // Возврат у текущего ребёнка
            if (count[i] == 0) { // Если пара значений содержит 0, то такая пара не актуальна
                break; // Поиск прекращается
            }
        }
    }

    public int distributeCookies(int[] cookies, int k) {
        ans = Integer.MAX_VALUE;
        count = new int[k];
        backtrack(0, k, cookies);
        return ans;
    }
}

package tasks.leetcode.array;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        // Вычисляем общее кол-во газа и затрат газа
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        // Если общих затрат больше, чем общего запаса, то невозможно обойти массив
        if (totalGas < totalCost) {
            return -1;
        }

        int start = 0; // Отвечает за искомое значение номера начальной станции
        int currGas = 0; // Текущий запас газа
        for (int i = 0; i < gas.length; i++) {
            // Текущий запас + Разность между газом следующей станции и затрат газа до неё
            currGas += (gas[i] - cost[i]);
            // Если запас газа отрицательный, то
            if (currGas < 0) {
                start = i + 1; // сдвигаем указатель относительно i
                currGas = 0; // обнуляем запас газа
            }
        }
        return start;
    }
}

package math.my;

/**
 * Чётные числа в двоичной системе счисления всегда оканчиваются на 0, а нечетные — на 1.
 * Побитовое ИЛИ в ситуации 0 | 1 = 1.
 * Следовательно, если в задаче имеется в виду побитовое ИЛИ всех чисел массива, то:
 * 1. Если в массиве есть ХОТЯ БЫ ОДНО нечётное число, то и в итоге получим нечётное число.
 * 2. Если в массиве ТОЛЬКО чётные числа, то и на выходе получим чётное число.
 */
public class ArrayOr {
    public static void main(String[] args) {
        int[] oddArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] evenArr = {2, 4, 6, 8, 10};
        System.out.println("Результат в массиве с нечётными числами: " + checkOrValues(oddArr));
        System.out.println("Результат в массиве с только чётными числами: " + checkOrValues(evenArr));
    }

    public static int checkOrValues(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res | arr[i];
        }
        return res;
    }
}

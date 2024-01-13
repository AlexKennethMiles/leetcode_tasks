package math.my;

/**
 * Поиск максимального значения, являющегося полным квадратом (в неотсортированном массиве).
 * Временная сложность: O(n) - линейная.
 * Оптимизировать до логарифмической сложности O(log n) невозможно.
 * В любом случае требуется проверка всех чисел на полный квадрат, а значит линейная сложность.
 */
public class FindMaxSquare {
    public static void main(String[] args) {
        int[] numbers = {16, 25, 9, 8, 36, 10, 49}; // Пример массива
        int largestSquareNumber = findLargestSquareNumber(numbers);

        if (largestSquareNumber != -1) {
            System.out.println("Наибольшее число в массиве, являющееся полным квадратом : " + largestSquareNumber);
        } else {
            System.out.println("В массиве нет ни одного полного квадрата.");
        }
    }

    // Метод поиска максимального полного квадрата в целочисленном массиве, сложость O(n)
    private static int findLargestSquareNumber(int[] arr) {
        int maxSquare = -1;
        for (int i = 0; i < arr.length; i++) { // fori быстрее foreach при работе с массивом примитивов (int)
            if (arr[i] > maxSquare // Если текущее больше сохранённого, то проверяем дальше
                    && isPerfectSquare(arr[i])) { // Если полный квадрат
                maxSquare = arr[i]; // Обновляем на актуальное
            }
        }
        return maxSquare;
    }

    // Проверка, является ли число полным квадратом
    private static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num); // Берём корень
        return sqrt * sqrt == num; // Проверяем, что корень в квадрате равен исходному
    }
}

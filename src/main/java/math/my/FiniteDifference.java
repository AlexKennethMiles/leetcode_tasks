package math.my;

import java.math.BigDecimal;
import java.util.Arrays;

public class FiniteDifference {
    // Матрица A: коэффициенты при неизвестных Yi, где i=1,2,3,4, ..., 121
    private static BigDecimal[][] A = new BigDecimal[121][121];
    // Матрица вектора b
    private static BigDecimal[] b = new BigDecimal[121];
    // Матрица вектора y для компьютерного счёта не требуется

    public static void main(String[] args) {
        // Размерность матрицы A при интервале [-7;5] и шаге h=0.1 равна 121
        int extension = getExtension(-7, 5, 0.1); // В этой строчке вычисляется эта размерность
        System.out.println("Размерность матрицы А: " + extension + "x" + extension); // Здесь подтверждается эта цифра
        prepare(); // Подготовка матриц для заполнения
        int i = 0; // Счётчик шагов
        BigDecimal x = BigDecimal.valueOf(-7d); // Начало интервала [-7;5]
        while (x.compareTo(BigDecimal.valueOf(5d)) <= 0) { // Пока не дошли до конца интервала [-7;5]
            compute(x, i); // Производим вычисление для i-го узла
            x = x.add(BigDecimal.valueOf(0.1)); // Прибавляем к иксу шаг h=0.1
            i++; // Увеличиваем счётчик шагов на 1
        }
        show();
        System.out.println("========================================");
        check();
    }

    // Метод получения количества итераций и размерности матриц
    private static int getExtension(int a, int b, double h) {
        return BigDecimal.valueOf(Math.sqrt(Math.pow(b - a, 2))) // Расстояние между a и b
                .divide(BigDecimal.valueOf(h)).intValue() // Делить на шаг h
                + 1; // + 1 (чтобы захватить правый конец отрезка)
    }

    // Заполнение массивов нулями
    private static void prepare() {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = BigDecimal.valueOf(0); // Матрица A квадратная
            }
            b[i] = BigDecimal.valueOf(0); // Матрица b прямоугольная, с одним столбцом
        }
    }

    // Вычисление коэффициентов при неизвестных
    private static void compute(BigDecimal x, int i) {
        if (x.compareTo(BigDecimal.valueOf(-7)) == 0) { // Если x равен -7
            A[i][0] = BigDecimal.valueOf(1).add(BigDecimal.valueOf(-2.5));
            A[i][1] = BigDecimal.valueOf(2.5);
            b[i] = BigDecimal.valueOf(0);
        } else if (x.compareTo(BigDecimal.valueOf(-7)) == 1 // Если x больше -7
                && x.compareTo(BigDecimal.valueOf(5)) == -1) { // И меньше 5, то:
            System.out.print("");
            // Переменная для хранения выражения:
            // sin|x|    это синус от икс по модулю (то есть без учёта знака икса, например, |-3| = 3 или |2| = 2)
            // ______
            //   4
            BigDecimal sinXDiv4 = BigDecimal.valueOf(Math.sin(Math.abs(x.doubleValue())))
                    .divide(BigDecimal.valueOf(4));
            // Данная ситуация даёт значение для трёх y, например, для y1,y2,y3, потом для y2,y3,y4 и т.д.
            A[i][i - 1] = BigDecimal.valueOf(0.25) // 1/4
                    .subtract(sinXDiv4); // Минус (sin|x|)/4;

            A[i][i] = BigDecimal.valueOf(2).multiply(x) // 2*x
                    .subtract(BigDecimal.valueOf(0.5)); // Минус 2/4

            A[i][i + 1] = BigDecimal.valueOf(0.25) // 1/4
                    .add(sinXDiv4); // Плюс (sin|x|)/4

            b[i] = x.multiply(BigDecimal.valueOf(-1));

        } else if (x.compareTo(BigDecimal.valueOf(5)) == 0) { // Если x равен 5
            // В матрице индекс начинается с нуля, поэтому для i=121 индекс равен 120
            A[120][120] = BigDecimal.valueOf(1);
            b[120] = BigDecimal.valueOf(2);
        }
    }

    // Вывод результатов компьютерного счёта
    private static void show() {
        System.out.println("Матрица A:");
        Arrays.stream(A).map(Arrays::toString).forEach(System.out::println); // Вывод матрицы A
        System.out.println("Матрица вектора b: " + Arrays.toString(b));
    }

    private static void check() {
        int b2 = Integer.MIN_VALUE; // Находим шаг компьютерного счёта, на котором b=3
        for (int i = 0; i < b.length; i++) {
            if (b[i].compareTo(BigDecimal.valueOf(3)) == 0) {
                b2 = i;
            }
        }
        int b3 = Integer.MIN_VALUE; // Находим шаг компьютерного счёта, на котором b=3
        for (int i = 0; i < b.length; i++) {
            if (b[i].compareTo(BigDecimal.valueOf(-1)) == 0) {
                b3 = i;
            }
        }
        System.out.println("Результаты компьютерного счёта с шагом h=0.1 для сравнения с ручным счётом и шагом h=4:");
        System.out.println("Матрица A на шаге i=1," + b2 + "," + b3 + "," + "121:");
        System.out.println("Для шага i=1: [ " + A[0][0] + ", " + A[0][1] + ", " + A[0][2] + ", " + A[0][3] + " ]");
        System.out.println("Для шага i=" + b2 + ": [ " + A[b2][b2 - 1] + ", " + A[b2][b2] + ", " + A[b2][b2 + 1] + ", " + A[b2][b2 + 2] + " ]");
        System.out.println("Для шага i=" + b3 + ": [ " + A[b3][b3 - 2] + ", " + A[b3][b3 - 1] + ", " + A[b3][b3] + ", " + A[b3][b3 + 1] + " ]");
        System.out.println("Для шага i=121: [ " + A[120][118] + ", " + A[120][119] + ", " + A[120][120] + " ]");

        System.out.println("Матрица вектора b на шаге i=1," + b2 + "," + b3 + "," + "121:");
        System.out.println("Для шага i=1: [ " + b[0] + " ]");
        System.out.println("Для шага i=" + b2 + ": [ " + b[b2] + " ]");
        System.out.println("Для шага i=" + b3 + ": [ " + b[b3] + " ]");
        System.out.println("Для шага i=121: [ " + b[120] + " ]");
    }

}

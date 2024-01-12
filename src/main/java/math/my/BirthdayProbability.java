package math.my;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BirthdayProbability  {
    public static void main(String[] args) {
        int totalStudents = 50;
        BigDecimal probability = calculateBirthdayProbability(totalStudents);
        System.out.println("Вероятность того, что по крайней мере у двух студентов одинаковая дата рождения: ");
        System.out.println(probability);
    }

    private static BigDecimal calculateBirthdayProbability(int totalStudents) {
        BigDecimal totalOutcomes = BigDecimal.valueOf(365).pow(totalStudents);
        BigDecimal uniqueOutcomes = BigDecimal.valueOf(365);

        BigDecimal probabilityAllDifferent = uniqueOutcomes.divide(totalOutcomes, 127, RoundingMode.HALF_UP);

        return BigDecimal.ONE.subtract(probabilityAllDifferent);
    }
}

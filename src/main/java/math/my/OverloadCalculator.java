package math.my;

import java.math.BigDecimal;
import java.math.MathContext;

public class OverloadCalculator {

    public static void main(String[] args) {
        BigDecimal acceleration = new BigDecimal("20"); // in meters per second squared
        BigDecimal gravity = new BigDecimal("9.8"); // acceleration due to gravity in meters per second squared

        BigDecimal overload = calculateOverload(acceleration, gravity);

        System.out.println("The overload of the passenger on the plane is: " + overload);
    }

    private static BigDecimal calculateOverload(BigDecimal acceleration, BigDecimal gravity) {
        BigDecimal aSquaredOverGSquared = acceleration.pow(2).divide(gravity.pow(2), MathContext.DECIMAL128);
        BigDecimal sqrtTerm = BigDecimal.ONE.add(aSquaredOverGSquared);

        BigDecimal overload = sqrtTerm.sqrt(MathContext.DECIMAL128);

        return overload;
    }
}

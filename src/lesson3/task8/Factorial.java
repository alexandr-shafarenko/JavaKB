package lesson3.task8;

import java.math.BigInteger;

public class Factorial {
    public static void main(String args[]) {
        int start = 10;
        int end = 15;
        System.out.printf("Факториал от %d до %d - %d", start, end, factorial(start, end));
    }

    public static BigInteger factorial(int start, int end) {
        BigInteger result = BigInteger.ONE;
        for (int i = start; i <= end; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

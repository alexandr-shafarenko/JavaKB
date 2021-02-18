package lesson3.task6;

public class Jogging {
    public static void main(String[] args) {
        double result = 10;
        for (int i = 0; i <= 7; i++) {
            result *= 1.1;
        }
        System.out.printf("За семь дней спортсмен пробежит путь - %.2f км%n", result);
    }
}

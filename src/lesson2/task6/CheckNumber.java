package lesson2.task6;

import static lesson1.Base.generateRandomDigitNumber;

public class CheckNumber {
    public static void main(String[] args) {
        int number;
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                number = generateRandomDigitNumber(3);
            } else {
                number = generateRandomDigitNumber(4);
            }
            checkNumber(number, 3, 7);
        }
    }
    static void checkNumber(int number, int base, int lastDigit) {
        int countBase = 0;
        System.out.println("Проверяем число " + number + ":");
        for (int i = 0; i < String.valueOf(number).length(); i++) {
            countBase++;
            if (i == String.valueOf(number).length() - 1) {
                if (countBase == base) {
                    System.out.println("1. Число является " + base + " значным");
                } else {
                    System.out.println("1. Число не является " + base + " значным");
                }
                if (number % 10 == lastDigit) {
                    System.out.println("2. Последняя цифра равна " + lastDigit);
                } else {
                    System.out.println("2. Последняя цифра не равна " + lastDigit);
                }
            }
        }
        if (number % 2 == 0) {
            System.out.println("3. Число четное");
        } else {
            System.out.println("3. Число нечетное");
        }
        System.out.println();
    }
}

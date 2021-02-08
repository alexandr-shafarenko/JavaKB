package lesson1.task6;

public class CheckNumber {
    public static void main(String[] args) {
        int number = 967;
        checkNumber(number, 3, 7);
    }
    static void checkNumber(int number, int base, int lastDigit) {
        int countBase = 0;
        for (int i = 0; i < String.valueOf(number).length(); i++) {
            countBase++;
            if (i == String.valueOf(number).length() - 1) {
                if (countBase == base) {
                    System.out.println("Число является " + base + " значным");
                } else {
                    System.out.println("Число не является " + base + " значным");
                }
                if (number % 10 == lastDigit) {
                    System.out.println("Последняя цифра равна " + lastDigit);
                } else {
                    System.out.println("Последняя цифра не равна " + lastDigit);
                }
            }
        }
        if (number % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
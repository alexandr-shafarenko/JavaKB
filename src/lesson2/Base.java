package lesson2;

public class Base {
    public static int generateRandomDigitNumber(int countNumbers) {
        return (int)Math.pow(10, countNumbers - 1) + (int)(Math.random() * (Math.pow(10, countNumbers) - 1));
    }

    public static int[] arrNumbers(int number) {
        int[] arrNumbers = new int[Integer.toString(number).length()];
        while (number > 0) {
            for (int i = arrNumbers.length - 1; i >= 0; i--) {
                arrNumbers[i] = number % 10;
                number /= 10;
            }
        }
        return arrNumbers;
    }
}

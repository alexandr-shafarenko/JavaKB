package lesson1;

public class Base {
    public static int generateRandomDigitNumber(int countNumbers) {
        return (int)Math.pow(10, countNumbers - 1) + (int)(Math.random() * (Math.pow(10, countNumbers) - 1));
    }
}

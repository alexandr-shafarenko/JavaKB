package lesson1.task5;

import static lesson1.Base.generateRandomDigitNumber;

public class CompareDigitalNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int digitNum = generateRandomDigitNumber(4);
            System.out.println("В натуральном числе " + digitNum + " все цифры " + (isDigitalNumbersDifferent(digitNum) ? "различны" : "не различны"));
        }
    }
    static boolean isDigitalNumbersDifferent(int digitNum) {
        String digitNumbers = digitNum+"";
        for (int i = 0; i < digitNumbers.length(); i++) {
            for (int j = i + 1; j < digitNumbers.length(); j++) {
                if (Character.getNumericValue(digitNumbers.charAt(i)) == Character.getNumericValue(digitNumbers.charAt(j))) {
                    return false;
                }
            }
        }
        return true;
    }
}

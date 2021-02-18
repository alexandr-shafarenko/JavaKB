package lesson2.task5;

import lesson2.Base;

import static lesson2.Base.generateRandomDigitNumber;

public class CompareDigitalNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int digitNum = generateRandomDigitNumber(4);
            System.out.println("В натуральном числе " + digitNum + " все цифры " + (isDigitalNumbersDifferent(digitNum) ? "различны" : "не различны"));
        }
    }
    static boolean isDigitalNumbersDifferent(int digitNum) {
        int[] digitNumbers = Base.arrNumbers(digitNum);
        for (int i = 0; i < digitNumbers.length; i++) {
            for (int j = i + 1; j < digitNumbers.length; j++) {
                if (digitNumbers[i] == digitNumbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

package lesson1.task4;

import static lesson1.Base.generateRandomDigitNumber;

public class ReverseDigitalNumbers {
    public static void main(String[] args) {
        int digitNum = generateRandomDigitNumber(4);
        System.out.println("Натуральное число " + digitNum + " в обратном порядке = " + reverseFourDigitalNumber(digitNum));
    }
    static int reverseFourDigitalNumber(int digitNum) {
        String reversingNumber = "";
        for (int i = 1; i < String.valueOf(digitNum).length() + 1; i++) {
            if (i > 1) {
                reversingNumber += digitNum % (int)Math.pow(10, i) / (int)Math.pow(10, i - 1);
            } else {
                reversingNumber += (digitNum % (int)Math.pow(10, i));
            }
        }
        return Integer.parseInt(reversingNumber);
    }
}

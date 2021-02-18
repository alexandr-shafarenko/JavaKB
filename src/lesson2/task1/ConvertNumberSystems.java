package lesson2.task1;

public class ConvertNumberSystems {
    public static void main(String[] args) {
        System.out.println("Перевод из двоичной в десятичную:");
        convertToDecimal("000", 2);
        convertToDecimal("1010", 2);
        convertToDecimal("1", 2);
        convertToDecimal("1000", 2);
        convertToDecimal("110011", 2);
        convertToDecimal("1111111", 2);
        convertToDecimal("11111111", 2);
        System.out.println("Перевод из восьмеричной в десятичную:");
        convertToDecimal("020", 8);
        convertToDecimal("06541", 8);
        convertToDecimal("041222", 8);
        System.out.println("Перевод из шестнадцатиричной в десятичную:");
        convertToDecimal("9", 16);
        convertToDecimal("B", 16);
        convertToDecimal("1C", 16);
    }
    static void convertToDecimal(String number, int system) {
        int length = number.length() - 1;
        int sum = 0;
        for (int i = 0; i <= length; i++) {
            sum += Character.getNumericValue(number.charAt(i)) * Math.pow(system, length - i);
        }
        System.out.println(String.format(number + "_%d = " + sum + "_%d", system, 10));;
    }
}

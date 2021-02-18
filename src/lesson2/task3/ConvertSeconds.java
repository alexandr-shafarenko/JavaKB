package lesson2.task3;

import static lesson1.Base.generateRandomDigitNumber;

public class ConvertSeconds {
    private static final int SEC_OF_WEEK = 604800;
    private static final int SEC_OF_DAY = 86400;
    private static final int SEC_OF_HOUR = 3600;
    private static final int SEC_OF_MIN = 60;
    public static void main(String[] args) {
        int seconds = generateRandomDigitNumber(4);
        convertSeconds(seconds, false, false, false, true);
        convertSeconds(seconds, false, false, true, true);
        convertSeconds(seconds, false, true, true, true);
        convertSeconds(seconds, true, true, true, true);
    }
    static void convertSeconds(int seconds, boolean weeks, boolean days, boolean hours, boolean minutes) {
        String result = "";
        int varSeconds = seconds;
        if (weeks && varSeconds >= SEC_OF_WEEK) {
            int countWeeks = 0;
            countWeeks += varSeconds / SEC_OF_WEEK;
            varSeconds -= SEC_OF_WEEK * countWeeks;
            result += countWeeks + " недель ";
        }
        if (days && varSeconds >= SEC_OF_DAY) {
            int countDays = 0;
            countDays += varSeconds / SEC_OF_DAY;
            varSeconds -= SEC_OF_DAY * countDays;
            result += countDays + " дней ";
        }
        if (hours && varSeconds >= SEC_OF_HOUR) {
            int countHours = 0;
            countHours += varSeconds / SEC_OF_HOUR;
            varSeconds -= SEC_OF_HOUR * countHours;
            result += countHours + " часов ";
        }
        if (minutes && varSeconds >= SEC_OF_MIN) {
            int countMinutes = 0;
            countMinutes += varSeconds / SEC_OF_MIN;
            varSeconds -= SEC_OF_MIN * countMinutes;
            result += countMinutes + " минут ";
        }
        if (varSeconds >= 0) {
            result += varSeconds + " секунд ";
        }
        System.out.println(seconds + " секунд = " + result);
    }
}

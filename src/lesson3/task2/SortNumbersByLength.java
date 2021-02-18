package lesson3.task2;

import lesson3.Base;

public class SortNumbersByLength {
    public static void main(String[] args) {
        System.out.println("Числа в порядке возрастания значений длины - " + sortNumbersByLength(new int[]{23324234, 823423, 233, 3240, 13320}, "asc"));
        System.out.println("Числа в порядке убывания значений длины - " + sortNumbersByLength(new int[]{23324234, 823423, 233, 3240, 13320}, "desc"));
    }

    public static String sortNumbersByLength(int[] arr, String order) {
        String result = "";
        int[] sortedArr = Base.sortArr(arr, order);
        for (int i = 0; i < arr.length; i++) {
            result += sortedArr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }
        return result;
    }

}

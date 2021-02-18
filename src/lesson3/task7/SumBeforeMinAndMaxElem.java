package lesson3.task7;

import lesson3.task1.MaxElement;
import lesson3.task1.MinElement;

import java.util.Arrays;

public class SumBeforeMinAndMaxElem {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 8, 6, 8, 12, 4};
        System.out.printf("Сумма элементов между мин и макс элементами массива %s - %d", Arrays.toString(arr), sumBeforeMinAndMaxElem(arr));
    }

    public static int sumBeforeMinAndMaxElem(int[] arr) {
        int sumBeforeMinAndMaxElem = 0;
        int minElem = MinElement.minArrElement(arr);
        int maxElem = MaxElement.maxArrElement(arr);
        int indexMinElem = 0;
        int indexMaxElem = 0;
        boolean isMinIndex = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minElem && !isMinIndex) {
                indexMinElem = i;
                isMinIndex = true;
            } else if (arr[i] == maxElem) {
                indexMaxElem = i;
            }
        }
        if (indexMinElem >= indexMaxElem) {
            return 0;
        } else {
            for (int i = indexMinElem + 1; i < indexMaxElem; i++) {
                sumBeforeMinAndMaxElem += arr[i];
            }
            return sumBeforeMinAndMaxElem;
        }
    }
}

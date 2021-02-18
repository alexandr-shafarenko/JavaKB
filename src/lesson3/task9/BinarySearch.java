package lesson3.task9;

import lesson3.Base;

import java.math.BigInteger;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = new int[]{8, 5, 3, 8, 6, 8, 12, 4};
        int[] sortedArr = Base.sortArr(arr, "asc");
        int elementToSearch = 8;
        System.out.printf("Индекс элемента %d в массиве %s - %d", elementToSearch, Arrays.toString(arr), binarySearch(sortedArr, elementToSearch));
    }

    public static int binarySearch(int[] arr, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (elementToSearch == arr[middleIndex]) {
                if (arr[middleIndex - 1] == arr[middleIndex]) {
                    lastIndex = middleIndex - 1;
                } else {
                    return middleIndex;
                }
            } else if (elementToSearch < arr[middleIndex]) {
                lastIndex = middleIndex - 1;
            } else if (elementToSearch > arr[middleIndex]) {
                firstIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}

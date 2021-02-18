package lesson3;

public class Base {
    public static int[] sortArr(int[] arr, String order) {
        boolean isAsc;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                switch (order.toLowerCase()) {
                    case "desc":
                        isAsc = arr[j - 1] < arr[j];
                        break;
                    default:
                        isAsc = arr[j - 1] > arr[j];
                        break;
                }
                if (isAsc) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}

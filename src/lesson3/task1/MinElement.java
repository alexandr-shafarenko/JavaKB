package lesson3.task1;

public class MinElement {
    public static void main(String[] args) {
        System.out.println(minArrElement(new int[]{2, 8, 3, 1, 10}));
    }

    public static int minArrElement(int[] arr) {
        int minArrElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (minArrElement > arr[i + 1]) {
                minArrElement = arr[i + 1];
            }
        }
        return minArrElement;
    }
}

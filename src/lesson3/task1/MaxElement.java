package lesson3.task1;

public class MaxElement {
    public static void main(String[] args) {
        System.out.println(maxArrElement(new int[]{2, 8, 3, 0, 10}));
    }

    public static int maxArrElement(int[] arr) {
        int maxArrElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (maxArrElement < arr[i + 1]) {
                maxArrElement = arr[i + 1];
            }
        }
        return maxArrElement;
    }
}

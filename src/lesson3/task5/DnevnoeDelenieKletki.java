package lesson3.task5;

public class DnevnoeDelenieKletki {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 0; i <= 24; i += 3) {
            sum *= 2;
        }
        System.out.printf("За 24 часа одновлеточная амеба разделится на - %d амеб%n", sum);
    }
}

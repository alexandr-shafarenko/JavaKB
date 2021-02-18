package lesson3.task3;

public class Vichislitb {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 2; i <= 256; i += i) {
            sum += i;
        }
        System.out.println(sum);
    }
}

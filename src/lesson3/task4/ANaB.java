package lesson3.task4;

public class ANaB {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.printf("%d * %d без операции умножения - %d%n", a, b, aNaB(a, b));
    }

    public static int aNaB(int a, int b) {
        int result = 0;
        if (a != 0 && b != 0) {
            for (int i = 1; i <= b; i++) {
                result += a;
            }
        }
        return result;
    }
}

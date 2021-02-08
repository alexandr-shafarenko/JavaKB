package lesson1.task7;

public class CloseFigure {
    public static void main(String[] args) {
        checkCloseFigure(2, 4, 3);
        checkCloseFigure(2, 4, 2);
    }
    static void checkCloseFigure (int a, int b, int r) {
        if (Math.pow(r, 2) >= (Math.pow(a, 2) + Math.pow(b, 2)) / 4) {
            System.out.println("Прямоугольник можно полностью закрыть круглой картонкой");
        } else {
            System.out.println("Прямоугольник нельзя полностью закрыть круглой картонкой");
        }
    }
}

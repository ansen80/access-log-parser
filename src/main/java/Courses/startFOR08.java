package Courses;

public class startFOR08 {

    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int x1 = 2;
        System.out.println("результат: ");
        leftTriangle(x1);

        int x2 = 4;
        System.out.println("результат: ");
        leftTriangle(x2);
    }
}

package Courses;

public class startFOR09 {

    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int x1 = 3;
        System.out.println("результат: ");
        rightTriangle(x1);

        int x2 = 4;
        System.out.println("результат: ");
        rightTriangle(x2);
    }
}
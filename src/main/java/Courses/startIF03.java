package Courses;

public class startIF03 {

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        }
            return y;
    }

    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 7;
        System.out.println("результат: " + max(x1, y1));

        int x2 = 8;
        int y2 = -1;
        System.out.println("результат: " + max(x2, y2));
    }
}

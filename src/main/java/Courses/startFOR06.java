package Courses;

public class startFOR06 {

    public static boolean equalNum(int x) {

        int first = x % 10;
        x /= 10;
        while (x > 0) {
            if (x % 10 != first) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int x1 = 1111;
        System.out.println("результат: " + equalNum(x1));

        int x2 = 1211;
        System.out.println("результат: " + equalNum(x2));
    }
}

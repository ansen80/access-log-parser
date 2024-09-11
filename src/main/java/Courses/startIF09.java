package Courses;

public class startIF09 {

    public static boolean magic6(int x, int y) {
        if (x + y == 6) {
            return true;
        }
        if ( x == 6 || y == 6) {
            return true;
        }
        if ( x - y == 6 || y - x == 6 ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 7;
        System.out.println("результат: " + magic6(x1,y1));

        int x2 = 8;
        int y2 = 2;
        System.out.println("результат: " + magic6(x2,y2));

        int x3 = 1;
        int y3 = 6;
        System.out.println("результат: " + magic6(x3,y3));

        int x4 = 3;
        int y4 = 9;
        System.out.println("результат: " + magic6(x4,y4));

    }
}

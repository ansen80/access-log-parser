package Courses;

public class startIF08 {

    public static boolean is35(int x) {
        if ( x % 3 == 0 && x % 5 == 0 ) {
            return false;
        }
        if ( x % 3 == 0 || x % 5 == 0 ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int x1 = 5;
        System.out.println("результат: " + is35(x1));

        int x2 = 8;
        System.out.println("результат: " + is35(x2));

        int x3 = 15;
        System.out.println("результат: " + is35(x3));

    }
}

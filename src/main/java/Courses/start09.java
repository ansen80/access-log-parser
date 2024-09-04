package Courses;

public class start09 {

    public static void main(String[] args) {
        int a1 = 2;
        int b1 = 2;
        int c1 = 2;
        boolean result_1 = isEqual (a1, b1, c1);
        System.out.println("результат: " + result_1);

        int a2 = 2;
        int b2 = 15;
        int c2 = 2;
        boolean result_2 = isEqual (a2, b2, c2);
        System.out.println("результат: " + result_2);
    }

    public static boolean isEqual (int a, int b, int c) {
        return ( a == b && b == c);
    }
}

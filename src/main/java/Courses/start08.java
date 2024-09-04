package Courses;

public class start08 {
    public static void main(String[] args) {
        int a1 = 6;
        int b1 = 2;
        boolean result_1 = isDivisor (a1, b1);
        System.out.println("результат: " + result_1);

        int a2 = 2;
        int b2 = 15;
        boolean result_2 = isDivisor (a2, b2);
        System.out.println("результат: " + result_2);
    }

    public static boolean isDivisor (int a, int b) {
        return ( a != 0 && b % a == 0) || ( b != 0 && a % b == 0);
    }



}

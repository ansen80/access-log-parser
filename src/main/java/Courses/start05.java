package Courses;

public class start05 {

    public static void main(String[] args) {
        int x = 32;
        int y = 516;
        boolean result_x = is2Digits(x);
        boolean result_y = isNo2Digits(y);
        System.out.println("результат для x: " + result_x);
        System.out.println("результат для y: " + result_y);
    }
    public static boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }
    public static boolean isNo2Digits(int y) {
        return y >= 10 && y <= 99;
    }
}

package ru.Courses.If.Mass.For;

public class start04 {
    public static void main(String[] args) {
        int x = 1;
        int y = -5;
        boolean result_x = isPositive(x);
        boolean result_y = isNegative(y);
        System.out.println("результат для x: " + result_x);
        System.out.println("результат для y: " + result_y);
    }
    public static boolean isPositive(int x) {
        return x > 0;
    }
    public static boolean isNegative(int y) {
        return y > 0;
    }
}

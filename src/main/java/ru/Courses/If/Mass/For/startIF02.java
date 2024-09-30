package ru.Courses.If.Mass.For;

public class startIF02 {

    public static int safeDiv(int x, int y) {
        if (y == 0) {
            return  0;
        }
        return  x / y;
    }
    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 0;
        System.out.println("результат: " + safeDiv(x1, y1));

        int x2 = 8;
        int y2 = 2;
        System.out.println("результат: " + safeDiv(x2, y2));
    }
}

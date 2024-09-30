package ru.Courses.If.Mass.For;

public class startFOR05 {

    public static int numLen(long x) {

        int length = 0;
        if (x == 0) {
            return 1;
        }
        while (x > 0) {
            x /= 10;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        long x = 12567;
        long x1 = 0;
        System.out.println("Результат: " + numLen(x));
        System.out.println("Результат: " + numLen(x1));
    }
}
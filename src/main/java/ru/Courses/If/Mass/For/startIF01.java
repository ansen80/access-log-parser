package ru.Courses.If.Mass.For;

public class startIF01 {

    public static int abs(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    public static void main(String[] args) {
        int x1 = 5;
        System.out.println("результат x1: " + abs(x1));

        int x2 = -3;
        System.out.println("результат x2: " + abs(x2));
    }
}

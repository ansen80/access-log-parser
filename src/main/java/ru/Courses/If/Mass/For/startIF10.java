package ru.Courses.If.Mass.For;

public class startIF10 {

    public static String age(int x) {
        int lastTwoNum = x % 100;
        int lastNum = x % 10;
        if (lastTwoNum >= 11 && lastTwoNum <= 14) {
            return x + " лет";
        }
        if (lastNum == 1) {
            return x + " год";
        } else if (lastNum >= 2 && lastNum <= 4) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }
    public static void main(String[] args) {

        int x1 = 5;
        System.out.println(age(x1));

        int x2 = 31;
        System.out.println(age(x2));

        int x3 = 44;
        System.out.println(age(x3));
    }
}

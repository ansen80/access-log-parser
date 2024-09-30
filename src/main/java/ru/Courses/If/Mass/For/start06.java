package ru.Courses.If.Mass.For;

public class start06 {

    public static void main(String[] args) {
        char x = 'D';
        char y = 'q';
        boolean result_x = isUpperCase(x);
        boolean result_y = isUpperCase(y);
        System.out.println("результат для x: " + result_x);
        System.out.println("результат для y: " + result_y);

    }
    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

}

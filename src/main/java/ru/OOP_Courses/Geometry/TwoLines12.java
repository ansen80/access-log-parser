package ru.OOP_Courses.Geometry;

import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class TwoLines12 {
    public static double powFromStr (String xStr, String yStr) {
        int x = parseInt(xStr);
        int y = parseInt(yStr);
        return pow(x, y);
    }
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Введите два числа в командной строке или разделе RUN в IntelliJ IDEA:");
            return;
        }
        double result = powFromStr (args[0], args[1]);
        System.out.println("Результат: " + result);
    }
}
package ru.OOP_Courses.Geometry;

public class Math11 {
    public static double sumAll(double... values) {
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }
    public static void main(String[] args) {
        int numerator1 = 3;
        int denominator1 = 5;
        double fraction1 = (double) numerator1 / denominator1;
        double result1 = sumAll(2, fraction1, 2.3);
        System.out.println("Результат сложения №1: " + result1);

        int numerator2 = 49;
        int denominator2 = 12;
        double fraction2 = (double) numerator2 / denominator2;
        int numerator3 = 3;
        int denominator3 = 2;
        double fraction3 = (double) numerator3 / denominator3;
        double result2 = sumAll(3.6, fraction2, 3, fraction3);
        System.out.println("Результат сложения №2: " + result2);

        int numerator4 = 1;
        int denominator4 = 3;
        double fraction4 = (double) numerator4 / denominator4;
        double result3 = sumAll(fraction4, 1);
        System.out.println("Результат сложения №3: " + result3);
    }
}


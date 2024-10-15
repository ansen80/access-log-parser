package ru.OOP_Courses.Geometry;

public class Sum {
    public static void main(String[] args) {
        double sum = 0.0;
        for (String arg : args) {
            try {
                double number = Double.parseDouble(arg);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Числом не является: " + arg + " => Считаем за 0!");
            }
        }
        System.out.println("результат: " + sum);
    }
}


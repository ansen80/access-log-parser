package ru.OOP_Courses.Geometry;

public class Sum_Simple {
    public static void main(String[] args) {
        double sum = 0.0;
        for (String arg: args) {
            if(isNumeric(arg)) {
                double number = Double.parseDouble(arg);
                sum += number;
            }else {
                System.out.println("Числом не является: " + arg + " => Считаем за 0!");
            }
        }
        System.out.println("результат: " + sum);
    }
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

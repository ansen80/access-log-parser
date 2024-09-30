package ru.OOP_Courses.Geometry;

public class Start04 {
    public static void main(String[] args) {
        Fraction04 f1 = new Fraction04(1, 3);
        Fraction04 f2 = new Fraction04(2, 5);
        Fraction04 f3 = new Fraction04(7, 8);

        Fraction04 result = f1.sum(f2).sum(f3).minus(5);

        System.out.println("Результат: " + result);
    }
}

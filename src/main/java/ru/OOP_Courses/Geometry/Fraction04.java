package ru.OOP_Courses.Geometry;

public class Fraction04 {
    private final int numerator;
    private final int denominator;

    public Fraction04(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю");
        }
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
    public Fraction04 sum(Fraction04 other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction04(newNumerator, newDenominator);
    }
    public Fraction04 sum(int number) {
        return sum(new Fraction04(number, 1));
    }
    public Fraction04 minus(Fraction04 other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction04(newNumerator, newDenominator);
    }
    public Fraction04 minus(int number) {
        return minus(new Fraction04(number, 1));
    }
}

package ru.Courses.If.Mass.For;

public class start02 {

    public static void main(String[] args) {
        int x=4568;
        int result = sumLastNums(x);
        System.out.println("результат: " + result);
    }

    public static int sumLastNums(int x) {
        int lastNum = x % 10;
        int secondLastNum = (x / 10) % 10;
        int sum = lastNum + secondLastNum;
        return sum;
    }
}

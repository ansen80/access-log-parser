package ru.Courses.If.Mass.For;

public class start03 {

    public static void main(String[] args) {
        char x = '3';
        int result = charToNum (x);
        System.out.println("результат: " + result);
    }

    public static int charToNum(char x) {
        int num = x - '0';
        return num;

    }

}

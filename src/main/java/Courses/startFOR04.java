package Courses;

public class startFOR04 {

    public static int pow(int x, int y) {

        int res = 1;
        for (int i = 0; i < y; i++) {
            res *= x;
        }
        return res;
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        System.out.println("Результат: " + pow(x, y));
    }
}
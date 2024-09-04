package Courses;

public class startFOR05 {

    public static int numLen(long x) {

        int length = 0;
        while (x > 0) {
            x /= 10;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        long x = 12567;
        System.out.println("Результат: " + numLen(x));
    }
}
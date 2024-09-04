package Courses;

public class startIF05 {

    public static int max3(int x, int y, int z) {
        int max01;
        if (x > y) {
            max01 = x;
        } else {
            max01 = y;
        }
        if (max01 > z) {
            return max01;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 7;
        int z1 = 7;
        System.out.println("результат: " + max3(x1, y1, z1));

        int x2 = 8;
        int y2 = -1;
        int z2 = 4;
        System.out.println("результат: " + max3(x2, y2, z2));
    }
}
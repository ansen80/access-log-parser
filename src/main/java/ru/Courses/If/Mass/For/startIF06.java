package ru.Courses.If.Mass.For;

public class startIF06 {

    public static boolean sum3(int x, int y, int z) {
        if (x + y == z ) {
            return true;
        } else if ( y + z == x ) {
            return true;
        } else if ( x + z == y ) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 7;
        int z1 = 2;
        System.out.println("результат: " + sum3(x1,y1,z1));

        int x2 = 8;
        int y2 = -1;
        int z2 = 4;
        System.out.println("результат: " + sum3(x2,y2,z2));

    }
}

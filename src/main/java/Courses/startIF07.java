package Courses;

public class startIF07 {

    public static int sum2(int x, int y) {
        int sum = x + y;
        if ( sum >= 10 && sum <= 19 ) {
            return 20;
        }
        else {
            return sum;
        }
    }
    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 7;
        System.out.println("результат: " + sum2(x1,y1));

        int x2 = 8;
        int y2 = -1;
        System.out.println("результат: " + sum2(x2,y2));
    }
}

package Courses;

public class startFOR07 {

    public static void square(int x) {

        for ( int i = 0 ; i < x ; i++) {
            for ( int j = 0 ; j < x ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int x1 = 2;
        System.out.println("результат: ");
        square(x1);

        int x2 = 4;
        System.out.println("результат: ");
        square(x2);

    }
}

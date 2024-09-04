package Courses;

public class startIF04 {

    public static String makeDecision(int x, int y) {
        if ( x > y ) {
            return "\"" + x + " > " + y + "\"";
        }
        else if ( x < y ) {
            return "\"" + x + " < " + y + "\"";
        }
        else {
            return "\"" + x + " == " + y + "\"";
        }
    }
    public static void main(String[] args) {
        int x1 = 5;
        int y1 = 7;
        System.out.println("результат: " + makeDecision(x1,y1));

        int x2 = 8;
        int y2 = -1;
        System.out.println("результат: " + makeDecision(x2,y2));

        int x3 = 4;
        int y3 = 4;
        System.out.println("результат: " + makeDecision(x3,y3));
    }
}

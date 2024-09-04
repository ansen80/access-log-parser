package Courses;

public class startFOR02 {

    public static String reverseListNums(int x) {
        String result = "";
        for ( int i = x ; i >= 0 ; i--) {
            result += i;
            if (i > 0) {
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("результат: \"" + reverseListNums(x) + "\"");
    }
}

package Courses;

public class startFOR03 {

    public static String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
        result += i;
        if (i < x - 1) {
            result += " ";
        }
    }
        return result;
}
    public static void main(String[] args) {
        int x = 9;
        System.out.println("результат: \"" + chet(x) + "\"");
    }
}

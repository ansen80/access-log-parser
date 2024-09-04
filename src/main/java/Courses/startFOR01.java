package Courses;

public class startFOR01 {

    public static String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i;
            if (i < x) {
                result += " ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("результат: \"" + listNums(x) + "\"");
    }
}


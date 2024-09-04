package Courses;

public class Testif {
    public static int min(int x, int y) {
        if ( x > y) return y;
        return x;
    }

    public static boolean isEqualLastFirst(String str) {
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        return first == last;
    }

    public static String delLast(String str) {
        String res = str;
        if(isEqualLastFirst(str)) {
            res = res.substring(0,str.length()-1);
        }
        return res;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 5;
        System.out.println("Минимальное значение между " + x + " и " + y + " = " + min(x, y));

        String str1 = "radar";
        System.out.println("Первый и последний символ строки \"" + str1 + "\" равны: " + isEqualLastFirst(str1));

        String str2 = "racecar";
        System.out.println("Результат удаления последнего символа (если он равен первому) из строки \"" + str2 + "\": " + delLast(str2));
    }
}

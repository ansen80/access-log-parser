package Courses;

public class start07 {

    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        int num = 5;
        boolean result_a = isInRange(a, b, num);
        System.out.println("результат: " + result_a);
    }
    public static boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }
}

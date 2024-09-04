package Courses;

public class start10 {

    public static void main(String[] args) {
        int result = lastNumSum(5, 11);
        result = lastNumSum(result, 123);
        result = lastNumSum(result, 14);
        result = lastNumSum(result, 1);
        System.out.println("ИТОГО: " + result);
    }

    public static int lastNumSum(int a, int b) {
        return (a % 10) + (b % 10);
    }

}

package Courses;

public class start {

   public static void main(String[] args) {
       double x = 5.3;
       double result = fraction(x);
       System.out.println("Результат: " + result);
    }

    public static double fraction(double x) {
        long integer = (long) x;
        double fractional = x - integer;
        fractional = Math.round(fractional * 1000) / 1000.0;
        return fractional;
    }
}



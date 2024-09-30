package OOP_Courses;

public class Start01 {
    public static void main(String[] args) {
        Point01 p1 = new Point01(1, 3);
        Point01 p2 = new Point01(1, 3);
        Point01 p3 = new Point01(5, 8);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
    }
}


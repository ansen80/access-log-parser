package OOP_Courses;

public class Start02 {
    public static void main(String[] args) {
        Point02 p1 = new Point02(1, 3);
        Point02 p2 = new Point02(5, 8);
        Point02 p3 = new Point02(10, 11);
        Point02 p4 = new Point02(15, 19);

        Line02 l1 = new Line02(p1, p2);
        Line02 l2 = new Line02(p3, p4);
        Line02 l3 = new Line02(p2.x, p2.y, p3.x, p3.y);

        System.out.println("Перед изменением: " + l3);

        l3.setStart(new Point02(2, 5));
        l3.setEnd(new Point02(12, 13));

        System.out.println("После изменения: " + l3);

        double totalLength = l1.getLength() + l2.getLength() + l3.getLength();
        System.out.println("Суммарная длина всех линий: " + totalLength);
    }
}
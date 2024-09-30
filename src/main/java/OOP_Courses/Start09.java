package OOP_Courses;

public class Start09 {
    public static void main(String[] args) {
        Point p01 = new Point(0, 0);
        Point p02 = new Point(4, 0);
        Point p03 = new Point(4, 3);
        Point p04 = new Point(2, 5);
        Point p05 = new Point(1, 4);
        Point p06 = new Point(0, 0);

        PolyLine polyline = new PolyLine(new Point[]{p01, p02, p03, p04, p05}, false);
        PolyLine closedPolyline = new PolyLine(new Point[]{p01, p02, p03, p04, p05, p06}, true);
        calculateTotalLength(new Metable09[]{polyline, closedPolyline});
    }
    public static void calculateTotalLength(Metable09[] measurables) {
        double totalLength = 0.0;
        for (Metable09 measurable : measurables) {
            totalLength += measurable.getLength();
        }
        System.out.println("Общая длина: " + totalLength);
    }
}
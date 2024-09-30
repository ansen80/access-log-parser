package OOP_Courses;
import java.util.Arrays;

public class Start03 {
    public static void main(String[] args) {
        Point03[] pointsArray = {
                new Point03(1, 5),
                new Point03(2, 8),
                new Point03(5, 3),
                new Point03(8, 9)
        };
        PolyLine03 polyline = new PolyLine03(pointsArray);
        System.out.println("Ломаная: " + polyline);

        double polylineLength = polyline.getLength();
        System.out.println("Длина ломаной: " + polylineLength);

        Line03[] lines = polyline.getLines();
        System.out.println("Массив линий: " + Arrays.toString(lines));

        double totalLinesLength = 0;
        for (Line03 line : lines) {
            totalLinesLength += line.getLength();
        }
        System.out.println("Длина массива линий: " + totalLinesLength);
        System.out.println("Длины совпадают? " + (polylineLength == totalLinesLength));

        polyline.points[1].x = 12;
        polyline.points[1].y = 8;
        System.out.println("Ломаная после изменения: " + polyline);
        System.out.println("Массив линий после изменения: " + Arrays.toString(lines));
    }
}
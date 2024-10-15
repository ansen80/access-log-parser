package ru.PolyLIne;
import java.awt.*;

class PolyLine {
    Point[] points;
    public PolyLine(Point... points) {
        this.points = points;
    }
    public double length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i + 1].x - points[i].x;
            len2 = points[i + 1].y - points[i].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PolyLine otherPolyLine = (PolyLine) obj;
        if (this.points.length != otherPolyLine.points.length) return false;
        for (int i = 0; i < this.points.length; i++) {
            if (!this.points[i].equals(otherPolyLine.points[i])) {
                return false;
            }
        }
        return true;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PolyLine: ");
        for (Point p : points) {
            sb.append(p.toString()).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);
        PolyLine polyLine1 = new PolyLine(p1, p2, p3);
        PolyLine polyLine2 = new PolyLine(new Point(1, 2), new Point(3, 4), new Point(5, 6));

        System.out.println("Сравниваем две линии: " + polyLine1.equals(polyLine2));
        System.out.println("Первая линия: " + polyLine1.length());
        System.out.println("Вторая линия: " + polyLine2.length());
    }
}



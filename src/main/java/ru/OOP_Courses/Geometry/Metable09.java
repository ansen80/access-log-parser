package ru.OOP_Courses.Geometry;

class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}
interface Metable09 {
    double getLength();
}
class Line implements Metable09 {
    private double length;

    public Line(double length) {
        this.length = length;
    }
    @Override
    public double getLength() {
        return length;
    }
}
class PolyLine implements Metable09 {
    private Point[] points;
    private boolean isClosed;

    public PolyLine(Point[] points, boolean isClosed) {
        this.points = points;
        this.isClosed = isClosed;
    }

    @Override
    public double getLength() {
        double length = 0.0;
        for (int i = 0; i < points.length - 1; i++) {
            length += calculateDistance(points[i], points[i + 1]);
        }
        if (isClosed) {
            length += calculateDistance(points[points.length - 1], points[0]);
        }
        return length;
    }
    private double calculateDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}


package ru.Line_Clone;

class Point implements Cloneable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y;
    }
    @Override
    protected Object clone() {
        return new Point(this.x, this.y);
    }
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
class Line implements Cloneable {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line line = (Line) obj;
        return start.equals(line.start) && end.equals(line.end);
    }
    @Override
    protected Object clone() {
        Point clonedStart = (Point) start.clone();
        Point clonedEnd = (Point) end.clone();
        return new Line(clonedStart, clonedEnd);
    }
    @Override
    public String toString() {
        return "Line(Start: " + start + ", End: " + end + ")";
    }
    public static void main(String[] args) {
        Point start = new Point(1, 2);
        Point end = new Point(3, 4);
        Line line1 = new Line(start, end);
        Line line2 = new Line(new Point(1, 2), new Point(3, 4));
        System.out.println("Сравнение двух линий: " + line1.equals(line2));

        Line clonedLine = (Line) line1.clone();
        System.out.println("Клонирование линии: " + clonedLine);

        line1.start.x = 10;
        System.out.println("Измененная линия: " + line1);
        System.out.println("Клон линии: " + clonedLine);
    }
}

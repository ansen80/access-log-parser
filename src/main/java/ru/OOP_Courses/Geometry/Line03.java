package ru.OOP_Courses.Geometry;

class Line03 {
    Point03 start, end;
    public Line03(Point03 start, Point03 end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
    public double getLength() {
        int dx = end.x - start.x;
        int dy = end.y - start.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

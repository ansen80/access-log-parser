package OOP_Courses;

class PolyLine03 {
    Point03[] points;
    public PolyLine03(Point03[] points) {
        this.points = points;
    }
    public double getLength() {
        double length = 0;
        for (Line03 line : getLines()) {
            length += line.getLength();
        }
        return length;
    }
    public Line03[] getLines() {
        Line03[] lines = new Line03[points.length - 1];
        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line03(points[i], points[i + 1]);
        }
        return lines;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Линия ");
        for (Point03 point : points) {
            sb.append(point).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
package OOP_Courses;

class Line02 {
    private Point02 start, end;
    public Line02 (Point02 start, Point02 end) {
        this.start = start;
        this.end = end;
    }
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
    public Line02(int x1, int y1, int x2, int y2) {
        this.start = new Point02(x1, y1);
        this.end = new Point02(x2, y2);
    }
    public double getLength() {
        int dx = end.x - start.x;
        int dy = end.y - start.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void setStart(Point02 start) {
        this.start = start;
    }
    public void setEnd(Point02 end) {
        this.end = end;
    }
}

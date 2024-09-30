package ru.OOP_Courses.Geometry;

public class Point01 {
    private int x, y;
    public Point01(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point01 point = (Point01) obj;
        return x == point.x && y == point.y;
    }
}

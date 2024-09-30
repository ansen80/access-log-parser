package ru.OOP_Courses.Geometry;

class Point03 {
    int x, y;
    public Point03(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
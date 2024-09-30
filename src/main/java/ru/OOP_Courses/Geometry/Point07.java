package ru.OOP_Courses.Geometry;

class Point07 {
    int x, y;
    public Point07(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Point3D extends Point07 {
    int z;
    public Point3D (int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public void coordinates() {
        System.out.println("Координаты плоскости: [" + x + ", " + y + ", " + z + "]");
    }
}

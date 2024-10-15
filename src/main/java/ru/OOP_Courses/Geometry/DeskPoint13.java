package ru.OOP_Courses.Geometry;

class DeskPoint13 implements Cloneable {
    int x,y;

    public DeskPoint13(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals (Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() !=obj.getClass()) {
            return false;
        }
        DeskPoint13 point = (DeskPoint13) obj;
        return  x == point.x && y == point.y;
    }
    @Override
    protected Object clone() {
        return new DeskPoint13(this.x, this.y);
    }

    @Override
    public String toString() {
        return "DeskPoint(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        DeskPoint13 point01 = new DeskPoint13(5,10);
        DeskPoint13 point02 = new DeskPoint13(5,10);
        DeskPoint13 point03 = new DeskPoint13(8,15);

        System.out.println("Сравнение точек point01 и point02: " + point01.equals(point02));
        System.out.println("Сравнение точек point02 и point03: " + point01.equals(point03));

        DeskPoint13 clonedPoint = (DeskPoint13) point01.clone();
        System.out.println("Клон точки: " + clonedPoint);
    }
}

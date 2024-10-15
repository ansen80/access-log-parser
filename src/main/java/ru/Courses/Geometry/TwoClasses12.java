package ru.Courses.Geometry;

import java.awt.Point;

public class TwoClasses12 {

    public static void main(String[] args) {
        Point point = new Point(30, 40);
        Point awtPoint = new Point(10, 20);
        System.out.println("Точка координат из пакета ru.Courses.Geometry: " + point);
        System.out.println("Точка координат из пакета java.awt: " + awtPoint);
    }
}

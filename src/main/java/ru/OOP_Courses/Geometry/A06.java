package ru.OOP_Courses.Geometry;

public class A06 {
    int x = 9;
    String str;
    void m() {
        System.out.println("A");
    }
}

class B extends A06 {
    {
    x = 42;
    }
    void m(int x){
        System.out.println("B" + x);
    }
}


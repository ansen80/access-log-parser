package ru.OOP_Courses.Geometry;

public class Start {
    public static void main(String[] args) {
        Name name=new Name("Вася");
        changeName(name);
        System.out.println(name);
    }
    public static void changeName(Name name) {
        if (name.soname==null) name.soname="Иванов";
    }
}

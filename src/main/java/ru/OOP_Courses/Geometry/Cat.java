package ru.OOP_Courses.Geometry;

public class Cat {

    String name;
    int age;

    static int count = 0;

    public Cat() {
        count++;
        this.name = "Уличный кот номер " + count;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Cat streetCat1 = new Cat();
        Cat streetCat2 = new Cat();
        System.out.println(streetCat1.name);
        System.out.println(streetCat2.name);
    }
}
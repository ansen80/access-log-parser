package ru.Cat;

import java.util.ArrayList;
import java.util.List;

class Cat {
    private static String breed = "Persian";
    public String name;
    private Integer age;
    private List<String> friendsName = new ArrayList<>();

    public Cat(String name, Integer age, List<String> friendsName) {
        this.name = name;
        this.age = age;
        this.friendsName = friendsName;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendsName=" + friendsName +
                '}';
    }
}

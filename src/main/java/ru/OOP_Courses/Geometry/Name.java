package ru.OOP_Courses.Geometry;

public class Name {
    String name, soname;

    public Name(String name, String soname) {
        this.name = name;
        this.soname = soname;
    }

    public Name(String name) {
        this(name, null);
    }
    public String toString() {
        String res = "";
        if (name != null) res += name + " ";
        if (soname != null) res += soname;
        return res;
    }
}

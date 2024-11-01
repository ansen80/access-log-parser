package ru.Cat;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("До обнуления: " + cat);

        FieldNullifier.nullifyFields(cat);

        System.out.println("После обнуления: " + cat);
    }
}

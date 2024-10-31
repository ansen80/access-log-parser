package ru;

import java.util.ArrayList;
import java.util.Arrays;


public class StreamApiExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,6,45678, 5, 34));

        System.out.println(list.stream().sorted((o1, o2) -> o2.compareTo(o1)).toList());
    }
}

package ru.OOP_Courses.Geometry;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetString {
    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Привет", "мир,", "это", "я!");
        String result = getStringFromStream(stringStream);
        System.out.println(result);
    }
}

package ru.Courses.If.Mass.For;
import java.util.Arrays;

public class startMass10 {

    public static void main(String[] args) {
        int[] arr = {1,2,-3,4,-2,2,-5};
        int[] result = deleteNegative(arr);
        System.out.println("результат: " + Arrays.toString(result));
    }
    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value >= 0) {
                result[index] = value;
                index++;
            }
        }
        return result;
    }
}

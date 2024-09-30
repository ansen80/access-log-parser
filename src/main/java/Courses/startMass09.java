package Courses;
import java.util.Arrays;

public class startMass09 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,8,2,2,9};
        int x = 2;
        int[] indices = findAll(arr, x);
        System.out.println("Индексы всех вхождений: " + Arrays.toString(indices));
    }
    public static int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int value : arr) {
            if (value == x) {
                count++;
            }
        }
        int[] indices = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                indices[index] = i;
                index++;
            }
        }
        return indices;
    }
}

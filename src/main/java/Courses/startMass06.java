package Courses;

public class startMass06 {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.print("результат: ");
        printArray(arr);
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
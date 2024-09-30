package ru.Courses.If.Mass.For;

public class startMass08 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {7,8,9};
        int[] concatenatedArr = concat(arr1, arr2);
        System.out.print("результат: ");
        printArray(concatenatedArr);

    }
    public static int[] concat(int[] arr1, int[] arr2) {

        int[] concatenatedArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            concatenatedArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            concatenatedArr[arr1.length + i] = arr2[i];
        }
        return concatenatedArr;
    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
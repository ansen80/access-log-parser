package ru.Courses.If.Mass.For;

public class startMass12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        int pos = 3;
        int[] result = add(arr, ins, pos);
        System.out.print("результат: ");
        printArray(result);
    }
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] newArr = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            newArr[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            newArr[i + ins.length] = arr[i];
        }
        return newArr;
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
package Courses;

public class startMass11 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x = 9;
        int pos = 3;
        int[] newArr = add(arr, x, pos);
        System.out.println("результат: ");
        printArray(newArr);
    }
    public static int[] add(int[] arr, int x, int pos) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

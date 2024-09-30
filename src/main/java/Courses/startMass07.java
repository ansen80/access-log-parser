package Courses;

public class startMass07 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = reverseBack(arr);
        System.out.print("результат: ");
        printArray(reversedArr);
    }
    public static int[] reverseBack(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
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
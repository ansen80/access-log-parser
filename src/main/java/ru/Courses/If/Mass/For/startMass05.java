package ru.Courses.If.Mass.For;

public class startMass05 {

    public static void main(String[] args) {
        int [] arr = {1,-2,-7,4,2,2,5};
        int [] arr2 = {1,-2,-7,4,-7,-2,1};
        System.out.println("peзультат: " + palindrom(arr) );
        System.out.println("peзультат: " + palindrom(arr2) );
    }
    public static boolean palindrom(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

package ru.Courses.If.Mass.For;

public class startMass03 {

    public static void main(String[] args) {
        int [] arr = {1,-2,-7,4,2,2,5};
        int result = maxAbs(arr);
        System.out.println("результат: " + result);
    }
    public static int maxAbs(int[] arr) {
        int maxabsValue = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(maxabsValue)) {
                maxabsValue = arr[i];
            }
        }
        return maxabsValue;
    }
}

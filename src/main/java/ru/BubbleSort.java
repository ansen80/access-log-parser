package ru;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] intArray) {
        for (int i=0; i < intArray.length - 1; i++) {
            for (int j=0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {3, 2, 9, 1, 4, 6};
        bubbleSort(numbers);
        System.out.println("После сортировки: " + Arrays.toString(numbers));
    }
}
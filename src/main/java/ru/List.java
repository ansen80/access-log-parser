package ru;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        int N = 8;
        ArrayList<Integer> numbers = new ArrayList(N);
        for (int i = 1; i <= N; i++) {
            numbers.add(i);
        }
        System.out.println("Исходный список:");

        printList(numbers);
        for (int i = 0; i < N; i += 2) {
            swap(numbers, i, i + 1);
        }
        System.out.println("Изменённый список:");
        printList(numbers);
    }

    private static void swap(ArrayList<Integer> list, int firstIndex, int secondIndex) {
        int temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
    }

    private static void printList(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}


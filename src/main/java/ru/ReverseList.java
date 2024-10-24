package ru;

import java.util.ArrayList;

public class ReverseList {
    public static void reverse(ArrayList<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size()/2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(n-i));
            intList.set(n - i, temp);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("До обращения: " + numbers);
        reverse(numbers);
        System.out.println("После обращения: " + numbers);
    }
}
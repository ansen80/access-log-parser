package com.stepup.beginning;

import java.util.Scanner;

public class text_length {
    public static void main(String[] args) {
        System.out.print("Введите текст и нажмите <Enter>: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Длина текста: " + text.length());

    }
}

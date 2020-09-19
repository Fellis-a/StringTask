package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("введите текст");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        float percent = Logic.Percent(text);//функция подсчитывает процент букв в тексте

        System.out.println(percent);
    }
}

package com.goit.Lesson1;

import java.util.Scanner;

public class PrintFromKeyboard {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = in.nextLine();
        System.out.println("Please enter your surname:");
        String surname = in.nextLine();
        System.out.println("Please enter your age:");
        int age = in.nextInt();
        System.out.printf("Your name and surname: " + name + " " + surname + " and your age: " + age);
    }
}
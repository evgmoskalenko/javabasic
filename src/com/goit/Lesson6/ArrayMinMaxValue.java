package com.goit.lesson6;

import java.util.Scanner;

/**
 * написать класс, который будет находить минимальное и максимальное значение в массиве
 * сделать сортировку массива по возрастанию и убыванию
 */

public class ArrayMinMaxValue {
    public static void main(String[] args) {
        int[] foobar = inputData();
        if (foobar.length != 0) {
            min(foobar);
            max(foobar);
            System.out.println("max value: " + max(foobar) + ", and " + "min value: " + min(foobar));
        } else {
            System.out.println("Error");
        }
        //Arrays.sort()
    }

    public static int[] inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int s1 = in.nextInt();
        System.out.println("Input " + s1 + " numbers");
        int[] s = new int[s1];
        for (int i = 0; i < s1; i++) {
            int inputDataNumber = in.nextInt();
            s[i] = inputDataNumber;
        }
        return s;
    }

    public static int min(int[] arrayMin) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < arrayMin.length; i++) {
            if (arrayMin[i] < minValue) {
                minValue = arrayMin[i];
            }
        }
        return minValue;
    }

    public static int max(int[] arrayMax) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arrayMax.length; i++) {
            if (arrayMax[i] > maxValue) {
                maxValue = arrayMax[i];
            }
        }
        return maxValue;
    }
}

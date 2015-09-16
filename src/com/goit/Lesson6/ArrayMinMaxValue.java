package com.goit.lesson6;

import java.util.Scanner;

/**
 * написать класс, который будет находить минимальное и максимальное значение в массиве
 * сделать сортировку массива по возрастанию и убыванию
 */

public class ArrayMinMaxValue {
    public static void main(String[] args) {
        min(inputData());
        max(inputData());
        //System.out.println("max value: " + min() + " and" + "min value: " + max());
        //Arrays.sort()
    }

    public static int[] inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter numbers");
        int s1 = in.nextInt();
        int[] s = new int[s1];
        for (int i = 0; i<s1; i++) {
            int inputDataNumber = in.nextInt();
            s[i] = inputDataNumber;
        }
        return s;
    }

    public static int min(int[] arrayMin) {
        int minValue = Integer.MAX_VALUE;
        if (arrayMin.length != 0) {
            for (int i = 0; i < arrayMin.length; i++) {
                if (arrayMin[i] < minValue) {
                    minValue = arrayMin[i];
                }
            }
            return minValue;
        } else {
            System.out.println("Please enter the numbers");
            return 0;
        }
    }

    public static int max(int[] arrayMax) {
        int maxValue = Integer.MIN_VALUE;
        if (arrayMax.length != 0) {
            for (int i = 0; i < arrayMax.length; i++) {
                if (arrayMax[i] > maxValue) {
                    maxValue = arrayMax[i];
                }
            }
            return maxValue;
        } else {
            System.out.println("Please enter the numbers");
            return 0;
        }
    }
}

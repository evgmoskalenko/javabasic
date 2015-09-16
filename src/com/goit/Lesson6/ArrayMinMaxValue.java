package com.goit.lesson6;

import java.util.Scanner;

/**
 * написать класс, который будет находить минимальное и максимальное значение в массиве
 * сделать сортировку массива по возрастанию и убыванию
 */

public class ArrayMinMaxValue {
    public static void main(String[] args) {
        int[] arrayVarInputData = inputData();
        int minValue = min(arrayVarInputData);
        int maxValue = max(arrayVarInputData);
        if (arrayVarInputData.length != 0) {
            System.out.println("max value: " + maxValue + ", and " + "min value: " + minValue);
        } else {
            System.out.println("Error: Please enter a number, except for \"0\" or \"1\"");
        }
        //Arrays.sort()
    }

    public static int[] inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrayLength = in.nextInt();
        System.out.println("Input " + arrayLength + " numbers");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int inputDataNumber = in.nextInt();
            array[i] = inputDataNumber;
        }
        return array;
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

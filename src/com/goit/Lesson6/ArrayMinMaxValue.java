package com.goit.lesson6;

import java.util.Scanner;

/**
 * написать класс, который будет находить минимальное и максимальное значение в массиве
 * сделать сортировку массива по возрастанию и убыванию
 */

public class ArrayMinMaxValue {
    public static void main(String[] args) {
        int[] arrayInputData = inputData();
        int[] arraySortData = sortData(arrayInputData, true);
        int[] arrayReverseSortData = sortData(arrayInputData, false);
        int minValue = min(arrayInputData);
        int maxValue = max(arrayInputData);
        if (arrayInputData.length != 0) {
            System.out.println("\nMIN and MAX value: min=" + minValue + ", " + "max=" + maxValue);
            System.out.print("Sort: ");
            for (int i = 0; i < arraySortData.length; i++) {
                System.out.print(arraySortData[i] + " -> ");
            }
            System.out.print("Sort: ");
            for (int i = 0; i < arrayReverseSortData.length; i++) {
                System.out.print(arrayReverseSortData[i] + " <- ");
            }
        } else {
            System.out.println("Error: Please enter a number, except for \"0\" or \"1\"");
        }
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

    public static int[] sortData(int[] sortArray, boolean changeSort) {
        for (int i = sortArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (changeSort) {
                    if (sortArray[j] > sortArray[j + 1]) {
                        int tmp = sortArray[j];
                        sortArray[j] = sortArray[j + 1];
                        sortArray[j + 1] = tmp;
                    }
                } else {
                    if (sortArray[j] < sortArray[j + 1]) {
                        int tmp = sortArray[j];
                        sortArray[j] = sortArray[j + 1];
                        sortArray[j + 1] = tmp;
                    }
                }
            }
        }
        return sortArray;
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

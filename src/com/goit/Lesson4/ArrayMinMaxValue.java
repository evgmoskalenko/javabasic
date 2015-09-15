package Lesson4;

/**
 * написать класс который будет находить минимальное и максимальное значение в массиве
 * сортировка массива по возрастанию и убыванию
 */

public class ArrayMinMaxValue {
    public static void main(String[] args) {
        //System.out.println("max value: " + min + " and " "min value: " + max +);
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
            System.out.println("¬ведите пожалуйста числа");
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
            System.out.println("¬ведите пожалуйста числа");
            return 0;
        }
    }
}

package Lesson4;

public class ArrayMinMaxValue {
    public static void main(String[] args) {
        System.out.println("max value: " + min + " and " "min value: " + max +);
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
            System.out.println("������� ���������� �����");
            return 0;
        }
    }
    public static int max(int[] arrayMax) {
        int maxValue = Integer.MAX_VALUE;
        for (int i=0; i<arrayMax.length; i++) {
            if (maxValue < arrayMax[i]) {
                maxValue = arrayMax[i];
            }
        }
        return maxValue;
    }
}
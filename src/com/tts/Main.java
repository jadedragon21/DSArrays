package com.tts;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dblAyaya = {1, 5, 6, 5, 4, 1};
        int sum = 0;
        for (int i : dblAyaya) {
            sum = sum + i;
        }
        System.out.println("Output: Sum of the array is: " + sum);
        int size = 4;
        int power = 2;
        double[] result = toPower(size, power);
        System.out.print("Your result is: " + Arrays.toString(result));
    }

    public static double[] toPower(int size, int power) {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = Math.pow(Double.valueOf(i), Double.valueOf(power));
        }
        return result;
    }
}
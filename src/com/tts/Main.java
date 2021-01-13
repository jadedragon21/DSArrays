package com.tts;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //broken code #2
        double[] exampleArray = {1, 5, 6, 5, 4, 1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i < exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

                index = i;

            }

        }
        System.out.println(index);


        //Sum down below #1
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


    //math.pow #3
    public static double[] toPower(int size, int power) {
        double[] result = new double[size];
        for (int i = 0; i < size; i++) {
            result[i] = Math.pow(Double.valueOf(i), Double.valueOf(power));
        }
        return result;
    }
}
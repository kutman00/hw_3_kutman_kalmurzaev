package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] number = {8, -2, -4, 2, 3, 6, -5, 45, -9, 10, 11, -12, -13, 14, 15};
        System.out.println(Arrays.toString(number));
        double result = 0;
        double result2 = 0;
        boolean result3 = false;


        for (Double elementValue : number) {
            if (elementValue < 0) {
                result3 = true;
            } else {
                if (result3) {
                    result += elementValue;
                    result2++;
                }
            }
        }
        System.out.println(result / result2);


        int[] array = {8, -2, -4, 2, 3, 6, -5, 45, -9, 10, 11, -12, -13, 14, 15};
        System.out.println(Arrays.toString(number(array)));

    } public static int [] number (int[] number1) {
        for (int i = 0; i < number1.length; i++) {
            int min = number1[i];
            int min1 = i;
            for (int j = i + 1; j < number1.length; j++) {
                if (number1[j] < min) {
                    min = number1[j];
                    min1 = j;
                }
            } if (i!= min1 ){
                int number2 = number1[i];
                number1 [i] = number1[min1];
                number1[min1] = number2;
            }
        } return number1;
    }
}








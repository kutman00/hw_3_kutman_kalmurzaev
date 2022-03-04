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
    }

}


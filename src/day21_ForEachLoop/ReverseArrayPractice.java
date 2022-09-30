package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArrayPractice {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        int reversed[]= new int[numbers.length];

        int j=0;

        for (int i = numbers.length - 1; i >= 0; i--,j++) {
            reversed[j]=numbers[i];
        }

        System.out.println(Arrays.toString(reversed));

    }
}

package Replit_Tasks;

import java.util.Arrays;

public class CountEvenNumbers {
    public static void main(String[] args) {



        int[] numbers = {5, 5, 2, 2, 3, 4, 4,2,3,4,4,4};

        int sum=0;

        for (int i : numbers) {
            int count = 0;
            if (i % 2 == 0) {
                count++;
                sum+=count;
                }
                }
        System.out.println(sum);
    }}

package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray { // interview question
    public static void main(String[] args) {

        int[] numbers= {10,20,30,40,50,60,70,80};

        int[] reversed= new int[numbers.length]; // to make sure that Array has enough capacity to contain all the elements of first Array


        for (int i = numbers.length - 1, j=0 ; i >= 0; i--,j++) {
            reversed[j]= numbers[i];


        }




       /* reversed[0]=numbers[numbers.length-1];
        reversed[1]= numbers[2];
        reversed[1]=numbers[3];

        */



        System.out.println(Arrays.toString(reversed));







    }
}

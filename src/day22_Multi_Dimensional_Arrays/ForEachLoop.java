package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {


        int[][] array2D ={   {1,2,3},{4,5,6,7},{8,9,10,11,12}  };

        for (int[] eachArray : array2D) {


            for (int eachElement: eachArray)
                System.out.println(eachElement);
            System.out.println(Arrays.toString(eachArray));

        }


        System.out.println("--------------------------------------------------------");


        for (int[] each1Darray : array2D) {
            for (int eachElement : each1Darray) {  // we use for each loop to find numbers from beginning to the end
                System.out.println(eachElement);
            }

        }

    }
}

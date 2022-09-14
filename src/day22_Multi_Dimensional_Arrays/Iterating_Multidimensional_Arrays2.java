package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class Iterating_Multidimensional_Arrays2 {
    public static void main(String[] args) {


        int[][] array2D ={   {1,2,3},{4,5,6,7},{8,9,10,11,12}  };

        for (int i = array2D.length - 1; i >= 0; i--) { // i is the index number of 1D ararys starting from last index

            for (int j = 0; j < array2D[i].length; j++) { // j: index number of elements starting from zero

                System.out.print(array2D[i][j]+" ");

            }

            System.out.println(); //

        }

        System.out.println("----------------------------------------------------");


        for (int i = 0; i < array2D.length; i++) { // i: index of 1D array started from 0

            for (int j = array2D[i].length-1; j>=0; j--) {

                System.out.print(array2D[i][j]+" ");

            }
            System.out.println();
        }



    }
}

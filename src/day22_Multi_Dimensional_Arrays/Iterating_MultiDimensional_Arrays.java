package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class Iterating_MultiDimensional_Arrays {
    public static void main(String[] args) {


        int[][] array2D ={   {1,2,3},{4,5,6,7},{8,9,10,11,12}  };

        for(int i=0; i< array2D.length; i++){ // i represents index numbers of single dimensional arrays

            System.out.println(Arrays.toString(array2D[i]));


            for (int j = 0; j < array2D[i].length; j++) { // index number of elements


                System.out.print(array2D[i][j] +" ");

            }
        }


        System.out.println("-----------------------------------------------------");








    }
}

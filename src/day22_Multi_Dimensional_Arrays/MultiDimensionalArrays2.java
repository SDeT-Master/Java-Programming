package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays2 {

    public static void main(String[] args) {

        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        int[] arr3={7,8,9};


        System.out.println("------------------------------------2 Dimensional Arrays"+"\n");

        int[][] arr2D={ {1,2,3},{4,5,6},{7,8,9} };

                        //      0   1       2                   0           1           2               0           1       2
        int[][][]arr3D={ { {1,2,3},{4,5,6},{7,8,9} }   ,   { {10,21,31},{41,51,62},{71,82,92} },  { {11,22,32},{43,52,63},{732,823,9231} } };

        //                      0                                       1                                   2
        System.out.println(Arrays.deepToString(arr3D)); // gives me every single elements and arrays


        System.out.println(Arrays.deepToString(arr3D[1]));


        System.out.println(Arrays.toString(arr3D[1][1]));


        System.out.println(arr3D[0][2][2]);

        System.out.println("------------------------------------3 Dimensional Arrays"+"\n");

        for( int[][]each2D :arr3D){

            for(int[]each1D:each2D){

                for(int element:each1D){

                    System.out.print(element+" ");
                }
            }
        }

        System.out.println("------------------------------------4 Dimensional Arrays"+"\n");

        int[][][][] arr4D={ { { {1,2,3},{4,5,6},{7,8,9} }   ,   { {10,21,31},{41,51,62},{71,82,92} },  { {11,22,32},{43,52,63},{732,823,9231} } } };

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int i : each1D) {
                        System.out.print(i+" ");

                    }

                }

            }

        }



    }
}

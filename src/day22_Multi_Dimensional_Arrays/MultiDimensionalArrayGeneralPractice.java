package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class MultiDimensionalArrayGeneralPractice {
    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };
        for (int[] eachArr : arr2D) {
            for (int eachElement : eachArr) {
                System.out.println("eachElement = " + eachElement);
            }
        }

        System.out.println("-------------------------------------------------------------------");

            // iterating multi dimensional arrays
        int[][] arr2D2 = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };
        for (int i = 0; i < arr2D2.length; i++) {
            for (int j = 0; j < arr2D2[i].length; j++) {
                System.out.println(arr2D2[i][j]);
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------------");
        // iterating multi-dimensional arrays/ reversing
        // Reverse the arrays but not elements
        int[][] arr2D3 = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        for (int i = arr2D3.length - 1; i >= 0; i--) { // i: index number of 1D arrays starting from last index to 0
            for (int j =0; j< arr2D3[i].length; j++) {// j: index number of elements starting from 0 to last index
                System.out.println(arr2D3[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("-------------------------------------------------");
        // Reverse the elements. but not arrays
        int[][] arr2D4 = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        for (int i = 0; i < arr2D4.length; i++) {
            for (int j = arr2D4[i].length - 1; j >= 0; j--) {
                System.out.println(arr2D4[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D5 = {{1,2,3}, {4,5,6}, {7,8,9}};

        // 3 dimensional array contains 2 d arrays

        //                      0         1        2            0             1           2
        int[][][] arr3D = {  {{1,2,3}, {4,5,6}, {7,8,9}} ,  {{10,20,30}, {40,50,60}, {70,80,90}}   };
        //                            0                                     1
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println( Arrays.deepToString(arr3D[0] ) );
        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[0][0]));
        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int EachElement : each1D) {
                    System.out.print("EachElement = " + EachElement+" ");
                }
            }

        }
        System.out.println("-----------------------------------------");

        int[][][][] arr4D = {   {{{1,2,3}, {4,5,6}, {7,8,9}} ,{{10,20,30}, {40,50,60}, {70,80,90}}}    };
        for (int[][][] each3d : arr4D) {
            for (int[][] each2d : each3d) {
                for (int[] each1d : each2d) {
                    for (int eachElement : each1d) {
                        System.out.println("eachElement = " + eachElement);
                    }
                }

            }

        }

        System.out.println("------------------------------------------");
        // String of arrays
        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Aaron", "Shay", "Breanna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};

        String groups[][]=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));

        System.out.println("---------------------------------------------------------------------------------");

        }

}

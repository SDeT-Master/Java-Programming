package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {


        int[] array1={1,2,3,4};
        ArraysUtility.printEachElement(array1);
        System.out.println("--------------------");

        double[] array2={1.5, 2.6,2.5};
        ArraysUtility.printEachElement(array2);
        System.out.println("----------------------");

        char[] array3={'A','B','C','D'};
        ArraysUtility.printEachElement(array3);
        System.out.println("-----------------------");

        String[] array4={"Jo","Lo","Ken"};
        ArraysUtility.printEachElement(array4);
        System.out.println("-----------------------");


        int[] n1= {1,54,431,4231,1,4,36,64,2};
        int max1=ArraysUtility.max(n1);
        System.out.println(max1);
        System.out.println("----------------------");


        double[]n2= {1.2,1.1,6.6,9.0,5};
        double max2=ArraysUtility.max(n2);
        System.out.println(max2);
        System.out.println("---------------------");


        int[]arr1={1,25,5,4,35,3};
        boolean r1=ArraysUtility.contains(arr1,10);
        System.out.println(r1);
        System.out.println("------------------");





    }
}

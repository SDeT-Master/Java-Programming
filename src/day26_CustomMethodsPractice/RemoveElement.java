package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int[] numbers={100,200,300,400};
        numbers=removeElement(numbers,0);
        numbers=removeElement(numbers,0);
        numbers=removeElement(numbers,0);
        System.out.println(Arrays.toString(numbers));


    }

    // removes the index from the array;
    public static int[] removeElement(int[]array,int index){
        if(index<0 || index>array.length-1){
            System.err.println("Invalid Index"+index);
            System.exit(0);
        }
        int[] result=new int[array.length-1];

        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(i==index) {// if the element of array is matching with the element at the given index
                continue;// skips
            }
            result[j++]=array[i]; //;
        }
        return  result;
    }


    // removes the index from the array;
    public static double[] removeElement(double[]array,double index){
        if(index<0 || index>array.length-1){
            System.err.println("Invalid Index"+index);
            System.exit(0);
        }
        double[] result=new double[array.length-1];

        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(i==index) {// if the element of array is matching with the element at the given index
                continue;// skips
            }
            result[j++]=array[i]; //;
        }
        return  result;
    }


    // removes the index from the array;
    public static char[] removeElement(char[]array,char index){
        if(index<0 || index>array.length-1){
            System.err.println("Invalid Index"+index);
            System.exit(0);
        }
        char[] result=new char[array.length-1];

        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(i==index) {// if the element of array is matching with the element at the given index
                continue;// skips
            }
            result[j++]=array[i]; //;
        }
        return  result;
    }


    // removes the index from the array;
    public static String[] removeElement(String[]array,int index){ // index is always an int
        if(index<0 || index>array.length-1){
            System.err.println("Invalid Index"+index);
            System.exit(0);
        }
        String[] result=new String[array.length-1];

        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(i==index) {// if the element of array is matching with the element at the given index
                continue;// skips
            }
            result[j++]=array[i]; //;
        }
        return  result;
    }






}

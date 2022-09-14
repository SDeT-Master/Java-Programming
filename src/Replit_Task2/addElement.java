package Replit_Task2;

import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class addElement {
    public static void main(String[] args) {
        int[]arr1={1,2,3};
        arr1=addElements(arr1,3);
        System.out.println(Arrays.toString(arr1));

    }


    public static int[] addElements(int[] array,int element){
        int[] result= new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            result[i]=array[i];
        }
        result[array.length]=element;
       return result;
    }
}


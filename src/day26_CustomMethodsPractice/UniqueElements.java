package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[]array={1,2,2,3,3,4,4,33,9};
       int[]unique=uniqueElement(array);
        System.out.println(Arrays.toString(unique));
    }

    // this method returns the unique elements
    public static int[] uniqueElement(int[]array){
        int[] result={};
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){ 
                // if the element equals to one, then the element is unique
               result= ArraysUtility.addElement(result,each);
            }
        }
      return result;
    }

    public static double[] uniqueElement(double[]array){
        double[] result={};
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                // if the element equals to one, then the element is unique
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char[] uniqueElement(char[]array){
        char[] result={};
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                // if the element equals to one, then the element is unique
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static String[] uniqueElement(String[]array){
        String[] result={};
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){
                // if the element equals to one, then the element is unique
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


}

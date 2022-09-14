package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
      arr=  addInteger(arr,5);
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------");




        System.out.println("-----------------------");
        double[] arr2 ={1.5, 2.5, 3.5, 4.5};
       arr2= addDouble(arr2,5.5);
        System.out.println(Arrays.toString(arr2));


        String[] names= {"Tat", "James", "Goodie"};
        names=addString(names, "Neira");
        System.out.println(Arrays.toString(names));


        char[] chars={'A','B','C','D'};
        chars=addchar(chars,'E');
        System.out.println(Arrays.toString(chars));




    }

    // method overloading is about giving the same name to different methods //

    public static int[] addInteger(int[] array,int element){
        int[] result= new int[array.length+1]; // we use plus one to add one more element

        int i=0;
        for (int each : array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;



    }

    public static double[] addDouble(double[] array, double element){
        double[] result= new double[array.length+1]; // we use plus one to add one more element

        int i=0;

        for (double each : array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }

    public static String[] addString(String[] array, String element) {
        String[] result = new String[array.length + 1]; // we use plus one to add one more element

        int i = 0;

        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;
        
        
        
        


    }

    public static char[] addchar(char[] array, char element) {
        char[] result = new char[array.length + 1]; // we use plus one to add one more element

        int i = 0;

        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;


    }

}

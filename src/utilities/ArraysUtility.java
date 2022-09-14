package utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int sum(int a, int b){
        int sum=a+b;
        System.out.println(sum);
        return sum;
    }




    // prints each integer of an integer array in separate Lines
    public static void printEachElement(int[]array){
        for (int each : array) {
            System.out.println(each);
            
        }
    }

    // prints each decimal from a double array in separate lines
    public static void printEachElement(double[]array){
        for (double each : array) {
            System.out.println(each);

        }
    }


// prints each char of char array in separate lines;
    public static void printEachElement(char[]array){
        for (char each : array) {
            System.out.println(each);

        }
    }

    
    // prints each String of String array in separate lines;
    public static void printEachElement(String[]array){
        for (String each : array) {
            System.out.println(each);

        }
    }


    // returns the maximum number for integer Array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return  numbers[numbers.length-1];
    }

//returns max number from a double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return  numbers[numbers.length-1];
    }


    //finding the min number from an int array;
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return  numbers[0];
    }

// finding the min number from a double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return  numbers[0];
    }


    
    //check if the given integer is contained in the given array. returns boolean
    public static boolean contains(int[]array, int element){
        boolean result=false;
        for (int each : array) {
            if(each==element){
                result=true;
            }
        }
        return result;
        
    }


    //check if the given double is contained in the given array. returns boolean
    public static boolean contains(double[]array, double element){
        boolean result=false;
        for (double each : array) {
            if(each==element){
                result=true;
            }
        }
        return result;
    }



    //checks if the given char is contained in the given array/ returns boolean.
    public static boolean contains(char[]array, char element){
        boolean result=false;
        for (char each : array) {
            if(each==element){
                result=true;
            }
        }
        return result;
    }



    //checks if the given string is contained in the given array/ returns boolean.
    public static boolean contains(String[]array, String element){
        boolean result=false;
        for (String each : array) {
            if(each.equals(element)){
                result=true;
            }
        }
        return result;
    }


    public static int[] addElement(int[] array,int element){
        int[] result= new int[array.length+1]; // we use plus one to add one more element

        int i=0;
        for (int each : array) {
            result[i++]=each;

        }
        result[i]=element;

        return result;





    }

    public static double[] addElement(double[] array, double element){
        double[] result= new double[array.length+1]; // we use plus one to add one more element

        int i=0;

        for (double each : array) {
            result[i++]=each;
        }
        result[i]=element;

        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1]; // we use plus one to add one more element

        int i = 0;

        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;






    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1]; // we use plus one to add one more element

        int i = 0;

        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;

        return result;


    }



    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[]array, int element){
        int count=0;
        for (int each : array) { // each represents each element of the array
            if(each==element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[]array, double element){
        int count=0;
        for (double each : array) { // each represents each element of the array
            if(each==element){
                count++;
            }
        }
        return count;
    }


    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[]array, char element){
        int count=0;
        for (char each : array) { // each represents each element of the array
            if(each==element){
                count++;
            }
        }
        return count;
    }



    // returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[]array, String element){
        int count=0;
        for (String each : array) { // each represents each element of the array
            if(each==element){
                count++;
            }
        }
        return count;
    }



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



    // merges the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2){
        int[] result={};

        for (int each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (int each : arr2) {
            result=  ArraysUtility.addElement(result,each);
        }
        return result;
    }

    // merges the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2){
        double[] result={};

        for (double each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (double each : arr2) {
            result=  ArraysUtility.addElement(result,each);
        }
        return result;
    }


    // merges the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2){
        char[] result={};

        for (char each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (char each : arr2) {
            result=  ArraysUtility.addElement(result,each);
        }
        return result;
    }


    // merges the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2){
        String[] result={};

        for (String each : arr1) {
            result=ArraysUtility.addElement(result,each);
        }
        for (String each : arr2) {
            result=  ArraysUtility.addElement(result,each);
        }
        return result;
    }



    //replace the elements of the array at given index with the new element
    public static int[] replaceElement(int[]array, int index, int newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
        }
        array[index]=newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static double[] replaceElement(double[]array, int index, double newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
        }
        array[index]=newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static char[] replaceElement(char[]array, int index, char newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
        }
        array[index]=newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static String[] replaceElement(String[]array, int index, String newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index: "+index);
        }
        array[index]=newElement;
        return array;
    }



    // replaces all the matching old value of the array with new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue ){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){// equals operator
                array[i]=newValue; // assignment operator
            }

        }
        return array;
    }



    //replaces all the matching old value of the array with new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue ){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){// equals operator
                array[i]=newValue; // assignment operator
            }

        }
        return array;
    }



    //replaces all the matching old value of the array with new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue ){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldValue){// equals operator
                array[i]=newValue; // assignment operator
            }

        }
        return array;
    }



    //replaces all the matching old value of the array with new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue ){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldValue)){// equals operator
                array[i]=newValue; // assignment operator
            }

        }
        return array;
    }


    // removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[]array){
        int[]result={};
        for (int each : array) {
            if(!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[]array){
        double[]result={};
        for (double each : array) {
            if(!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[]array){
        char[]result={};
        for (char each : array) {
            if(!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    // removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[]array){
        String[]result={};
        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result= ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }






}

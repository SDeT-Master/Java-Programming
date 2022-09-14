package day26_CustomMethodsPractice;

public class FrequencyOfElement {


    public static void main(String[] args) {
        int[]arr={1,1,1,1,3,5,6,9,7,5};
       int n= frequencyOfElement(arr,1);
        System.out.println(n);

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
            if(each.equals(element)){
                count++;
            }
        }
        return count;
    }






}

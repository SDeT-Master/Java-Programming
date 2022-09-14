package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {


        String[] students={"Elif","Erkin","James","Dan","Hool","Nick","Shauna"};
        String[] earlyBirds= Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlyBirds));



        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        numbers=Arrays.copyOf(numbers,5); // copying starts from the first element, it just creates new ones
        System.out.println(Arrays.toString(numbers));


        System.out.println("-------------------------------------");


        char[] ch1= {'A', 'B','C','D','E','F','H','I'};
        char[] ch2= Arrays.copyOfRange(ch1,2,6+1);
        System.out.println(Arrays.toString(ch2));





        int[] scores={12,3,453,5,54,6,54,653,65,7,5,75,7,};
        int[] results=Arrays.copyOfRange(scores,3,7+1);
        System.out.println(Arrays.toString(results));



        int[] result2= Arrays.copyOfRange(scores,3,scores.length);
        System.out.println(Arrays.toString(result2));


        // loop is used for repeated actions





    }
}

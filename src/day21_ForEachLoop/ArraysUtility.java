package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {



        int[] nums= {1,2,3,4,5};

        System.out.println(Arrays.toString(nums)); // we use Arrays.toString if we want to print the while array

        System.out.println(nums[0]);

        System.out.println("--------------------------");


        int[]scores ={95, 2321, 32, 4,1,};   // ascending means smallest to largest

        Arrays.sort(scores); // prints from the smallest to the highest;
        System.out.println(Arrays.toString(scores));


        System.out.println("Min score"+scores[0]);
        System.out.println("Max Score"+scores[scores.length-1]);




        String[]names={"Anna", "Gunay", "Zuhal","Ahmet","Sinema"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));


        String[] words={"Anna", "ANNa"}; // upper case prints first because on ASCII table upper-case letters come first

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


        System.out.println("===========");


        int[] arr1={1,2,3};
        int[] arr2={1,3,2};

      boolean r1=  Arrays.equals(arr1,arr2);
        System.out.println(r1);


        Arrays.sort(arr1);
        Arrays.sort(arr2);

       boolean r2= Arrays.equals(arr1,arr2); // equals method always returns true or false
        System.out.println(r2);



        char[] ch1={'a','c', 'b'};
        char[] ch2={'b','c', 'a'};


        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);




    }
}

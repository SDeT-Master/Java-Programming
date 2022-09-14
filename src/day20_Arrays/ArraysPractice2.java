package day20_Arrays;

import day15_ForLoops.ForLoopIntro;

import java.util.Arrays;

public class ArraysPractice2 { // Arrays can contain multiple elements, Size is fixed, contains support primitives and non-primitives

    public static void main(String[] args) {

        char[] letters=new char[26];


        for (char i = 'A', j=0; i <= 'Z' && j<letters.length; i++, j++) { // i: index number of 0 and last index

            letters[j]=i;
        }

        System.out.println(Arrays.toString(letters));


        System.out.println("---------------------------------");


        for (int i = 0 , j='A'; i <letters.length ; i++, j++) {
            letters[i]=(char)j;

        }


        System.out.println(Arrays.toString(letters));


        char ch='A';
        for (int i = 0; i < letters.length; i++ , ch++) {
            letters[i]=ch;

        }

        System.out.println(Arrays.toString(letters));

    }
}

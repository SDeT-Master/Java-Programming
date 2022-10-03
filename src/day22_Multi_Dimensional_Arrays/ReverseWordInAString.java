package day22_Multi_Dimensional_Arrays;

import java.util.Arrays;

public class ReverseWordInAString {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String word[] = sentence.split(" ");
        String reverse = "";
        for (int i = word[1].length() - 1; i >= 0; i--) {
            reverse+=word[1].charAt(i);
        }
        System.out.println("reverse = " + reverse);

        word[1]=reverse;
        String result="";
        for (String eachWord : word) {
            result+=eachWord+" ";
        }
        System.out.println("result = " + result);

        System.out.println("------------------------------------------");


        String str="I love you so much Christine";
        String[]words=str.split(" ");
        String reverse1="";
        for (int i = words[5].length() - 1; i >= 0; i--) {
            reverse1+=words[5].charAt(i);
        }
        System.out.println("reverse1 = " + reverse1);

        String result1="";
        words[5]=reverse1;
        for (String eachWord : words) {
            result1 += eachWord + " ";
        }
        System.out.println("result1 = " + result1);


    }
}
/*
2. Write a program that can reverse the second word of the sentence
        Ex:
        sentence = "I Love Java";
        output:
        I evoL Java
        */


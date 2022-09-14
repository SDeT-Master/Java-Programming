package day25_CustomMethod_Overloading;

import utilities.StringUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        String str="Java Programming Language";
        StringUtility.printEachChar(str);

        System.out.println("------------------------------");

        String s1="Wooden Spoon";
       String reverse=StringUtility.reverse(s1);
        System.out.println(reverse);


        System.out.println("--------------------------");
        String word="Civic";
       boolean isPalindrome= StringUtility.isPalindrome(word);
        System.out.println(isPalindrome);


        System.out.println("----------------------------");
        String[]names ={"Anna","Java"," Python","Mom","Dad","Boy","Civic" };
        int count=0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);


        System.out.println("---------------------------------------");
        String st="java";
        String st2="jaav";
        boolean result=StringUtility.anagram(st,st2);
        System.out.println(result);


        System.out.println("---------");
        String str1="aaabbcjdsfkjdskabccasfa";
       String removed= StringUtility.removeDuplicates(str1);
        System.out.println(removed);




    }

}

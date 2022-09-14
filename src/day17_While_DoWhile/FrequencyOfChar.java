package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str=scan.nextLine();
        System.out.println("Enter a character: ");
        char ch=scan.next().charAt(0);
        int countChars=0;

        for (int i = 0; i < str.length(); i++) {
            char character=str.charAt(i);
            if(character==ch){
                countChars++;
            }
        }
        System.out.println(countChars);
    }
}

/*
1. Write a program that can return the frequency of a char from a
String
Ex:
str = "AAABBBC"
ch = 'A'
Output:
3
 */
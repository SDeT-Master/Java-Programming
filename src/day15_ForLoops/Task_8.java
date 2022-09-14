package day15_ForLoops;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word to check if the given word is Palindrome: ");
        String word=scan.nextLine();
        scan.close();
        String reversed="";
        for (int i =word.length()-1; i >=0; i--) {
            reversed+=word.charAt(i);
        }

        System.out.println(reversed.equals(word));

    }
}

/*
8. Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
 */
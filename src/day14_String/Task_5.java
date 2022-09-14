package day14_String;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        scan.close();

        if(word.charAt(0)>=47 && word.charAt(0)<=57){
            System.out.println("first character is digit");
        } else if(word.charAt(0)>=65&& word.charAt(0)<=90){
            System.out.println("first character is upper case letter");
        }else if(word.charAt(0)>=97 && word.charAt(0)<=122){
            System.out.println("first character is lower case letter");
        } else{
            System.out.println("first character is a special character");
        }

    }
}

/*
5. Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
HINT: 1. you need charAt() method
6. Ascii Table
 */
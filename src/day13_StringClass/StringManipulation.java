package day13_StringClass;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();
        if(str.isEmpty()){
            System.out.println("String is empty");
        }else if(str.length()>3){
            System.out.println(str.substring(str.length()-3));
        }else if(str.length()<=3){
            System.out.println(str);
        }
    }
}

/*
5. Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */

package day15_ForLoops;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str=scan.nextLine();
        scan.close();

        String letters="";
        String digits="";
        String special="";

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)>=97 && str.charAt(i)<=122|| str.charAt(i)>=65&& str.charAt(i)<=90){
                letters+=str.charAt(i);
            } else if(str.charAt(i)>=48 && str.charAt(i)<=57){
                digits+=str.charAt(i);
            }else{
                special+=str.charAt(i);
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);
        }

}
/*
5. write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!

 */
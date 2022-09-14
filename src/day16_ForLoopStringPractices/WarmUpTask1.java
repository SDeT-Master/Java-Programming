package day16_ForLoopStringPractices;

import java.util.Scanner;

public class WarmUpTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence to see its reversed version: ");
        String str=scan.nextLine();
        String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
    }
}

/*
1. Write a program that can reverse a String
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */
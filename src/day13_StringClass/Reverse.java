package day13_StringClass;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        if(str.length()<5){
            System.out.println("too short");
        }
         else if(str.length()>5){
            System.out.println("too long");
        } else {
            for (int i = str.length() - 1; i >= 0; i--) {
                char ch = str.charAt(i);
                System.out.print(ch);
            }

        }
    }
}

/*
1. Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
 */
package day13_StringClass;

import java.util.Scanner;

public class Print_theLongestString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first sentence");
        String str1=scan.nextLine();
        System.out.println("Enter your second sentence");
        String str2=scan.nextLine();

        if(str1.length()>str2.length()){
            System.out.println(str1);
        }else{
            System.out.println(str2);
        }

    }
}

/*
2. write a program that asks user to enter two strings, and print out the
longest string
 */
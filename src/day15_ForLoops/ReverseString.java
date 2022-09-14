package day15_ForLoops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }


        // below is another way of doing it
       /* String reversed="";
        for (int i = str.length()-1; i >=0 ; i--) {
           reversed+=""+str.charAt(i);
        }
        System.out.println(reversed);

        */
    }
}


/*
1. Write a program that can reverse any given string
String str = "Java"; ==> avaJ
 //       0123
 */
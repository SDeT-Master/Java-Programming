package day15_ForLoops;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any sentence and it will be reversed: ");
        String str=scan.nextLine();
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        System.out.println(result);

    }
}

/*
7. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */
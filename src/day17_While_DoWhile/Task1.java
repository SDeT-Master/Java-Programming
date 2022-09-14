package day17_While_DoWhile;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1= scan.nextInt();
        System.out.println("Enter your second number");
        int num2=scan.nextInt();
        int count=0;
       while (num1>=num2){
           num1-=num2;
           count++;
       }
        System.out.println(count+num1);
    }
}
/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.

 */
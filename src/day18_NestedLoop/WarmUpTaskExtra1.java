package day18_NestedLoop;

import java.util.Scanner;

public class WarmUpTaskExtra1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1=scan.nextInt();
        System.out.println("Enter your second number");
        int num2=scan.nextInt();
        int count=0;
        while(num1>=num2){
            num1-=num2;
            count++;
        }
        System.out.println(count);
    }
}

/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) and % operators
20 / 6 ==> 3 with the reaminder of 2
 */
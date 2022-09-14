package day16_ForLoopStringPractices;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first number");
        int num=scan.nextInt();
        System.out.println("Enter your second number");
        int num2=scan.nextInt();
        int result=0;
        if(num<0 && num2<0 || num<0 || num2<0){
            System.err.println("Invalid Number");
        }else{

        for (int i = 0; i < num; i++) {
            result +=num2;
        }
            System.out.println(result);
        }

    }
}
/*
3. Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200
 */
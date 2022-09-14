package day17_While_DoWhile;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your fist number: ");
        int num1=scan.nextInt();
        System.out.println("Enter your second number");
        int num2=scan.nextInt();

        while (num1>0 && num2>0){
           int sum= num1+num2;
            System.out.println(num1+" + "+num2+" is= "+sum);
            System.out.println("Enter your fist number: ");
             num1=scan.nextInt();
            System.out.println("Enter your second number");
            num2=scan.nextInt();
        }
        if(num1<0 && num2<0){
            System.exit(0);
        }

        scan.close();

    }
}
/*
2. Write a program that calculates the sum of numbers entered by the
user until user enters a negative number.
hint: you need an infinite loop
 */
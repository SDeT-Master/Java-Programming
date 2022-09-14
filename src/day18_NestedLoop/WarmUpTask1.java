package day18_NestedLoop;

import java.util.Scanner;

public class WarmUpTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1=scan.nextInt();
        System.out.println("Enter your second number");
        int num2= scan.nextInt();

        int count=0;

        while (num1>=num2){ // if num1 is greater than or equal to num2
            num1-=num2;// keep subtracting until they are equal
            count++;// how many times this process is being repeated
        }
        System.out.println(count);
    }

}
/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) and % operators
20 / 6 ==> 3 with the reaminder of 2
a = 20
b = 6;
a -= b;  // a = 14
a -= b;  // a = 8
a -= b;  // a = 2
x = 100;
y = 8;
while(a >= b){
a -= b;
count++;
}
 */
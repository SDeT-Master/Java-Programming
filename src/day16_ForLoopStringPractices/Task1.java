package day16_ForLoopStringPractices;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zero=0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number: ");
            int number=scan.nextInt();
            if(number>0){
                positive++;
            } else if(number<0){
                negative++;
            }else{
                zero++;
            }
        }
        System.out.println("zero = " + zero);
        System.out.println("negative = " + negative);
        System.out.println("positive = " + positive);

    }
}

/*
1. Write a program that asks user to enter number for 5 times, and print
how many positive and negative numbers user entered
Ex:
Inputs:
10
20
-1
0
3
Output:
3 positive and 1 negative
 */
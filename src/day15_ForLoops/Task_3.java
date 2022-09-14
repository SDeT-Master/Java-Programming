package day15_ForLoops;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter second number");
        int secondNum=scan.nextInt();
        int sum=0;

        for (int i = 1; i <=secondNum ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}

/*
3. write a program that can calculate the sum of all numbers between
1 to any given number
ex:
input: 100
output: 5050
input: 50
output: 1275
 */
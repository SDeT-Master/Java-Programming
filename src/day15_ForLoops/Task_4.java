package day15_ForLoops;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sum=1;
        int num=scan.nextInt();
        scan.close();

        for (int i = 1; i <= num ; i++) {
            sum*=i;
        }
        System.out.println(sum);
    }
}

/*
4. Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
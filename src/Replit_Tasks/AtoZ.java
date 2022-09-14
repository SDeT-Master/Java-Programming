package Replit_Tasks;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class AtoZ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("input:");
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);

        for (char i = start; i <='Z'|| i<='z' ; i++) {
            System.out.print(i);
            if(i==end)
                break;
        }
    }
}

/*Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

 */
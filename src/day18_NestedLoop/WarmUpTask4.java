package day18_NestedLoop;

import java.util.Scanner;

public class WarmUpTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();


        if(num%2==0){
            System.out.println(num+ " is an even number");
        }else {
            System.out.println(num+ " is an odd number");
        }

        System.out.println("would you like to enter another number ?");
        String response=scan.next();


        while (!(response.equals("yes".toLowerCase())|| response.equals("yes"))){
            if(response.equals("no".toLowerCase())){
                System.out.println();
                break;
            }
            System.out.println("Enter a number: ");
            num = scan.nextInt();
            if(num%2==0){
                System.out.println(num+ " is an even number");
            }else {
                System.out.println(num+ " is an odd number");
            }
            System.out.println("would you like to enter another number ?");
            response=scan.next();

        }
        scan.close();

    }
}
/*
2. Write a program that asks user to enter a numnber , and check if the
number is odd or even.
if it's odd, print "Odd Number"
if it's even, print "Even number"
Ask the user "Would you like to enter another number"
if user enters yes, repeat the previous steps
if user enters no, print nothing
If user enteres invalid answer, repeat the previous steps
 */
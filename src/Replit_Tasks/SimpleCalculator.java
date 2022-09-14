package Replit_Tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter your first number");
        int num1=scan.nextInt();
        System.out.println("enter your second number");
        int num2=scan.nextInt();
        calculator(num1,num2);


    }
    public static void calculator(int num1, int num2){
        int result=num1+num2;
        System.out.print(result);

    }

}

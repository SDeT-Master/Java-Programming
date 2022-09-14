package day17_While_DoWhile;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=scan.nextInt();
        System.out.println("Enter your second number");
        int num2=scan.nextInt();
        System.out.println("enter a math operator");
        char mathOp=scan.next().charAt(0);

        while(!(mathOp=='+' || mathOp=='-' ||mathOp=='/' ||mathOp=='*')) {
            System.err.println("Invalid operator: "+mathOp+" please re-enter a valid operator");
            System.out.println("Enter a number");
            num1=scan.nextInt();
            System.out.println("Enter your second number");
            num2=scan.nextInt();
            System.out.println("enter a math operator");
             mathOp=scan.next().charAt(0);
        }
        int result=0;
        if (mathOp == '+') {
          result=  num1+num2;
        }
        else if(mathOp=='-'){
            result=num1-num2;
        } else if(mathOp=='/'){
            result=num1/num2;
        }else{
            result=num1*num2;
        }

        System.out.println(result);
        scan.close();
    }
}
/*
3. write a program to ask user to enter two number and math operator,
and return the result.
if the operator is invalid operator, ask user to re-enter
the operator until user provides a valid operator (+, -, *, /)
 */
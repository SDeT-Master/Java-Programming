package day18_NestedLoop;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNum=scan.nextInt();
        System.out.println("Enter a math operator");
        char mathOp=scan.next().charAt(0);
        System.out.println("Enter your second number");
        int secondNUm=scan.nextInt();
        while (!(mathOp=='+'|| mathOp=='-'|| mathOp=='/'|| mathOp=='*')){
            System.out.println("Enter a valid math Op");
             mathOp=scan.next().charAt(0);
        }
        if(mathOp=='+'){
            System.out.println(firstNum+secondNUm);
        }else if(mathOp=='-'){
            System.out.println(firstNum-secondNUm);
        }else if(mathOp=='*'){
            System.out.println(firstNum*secondNUm);
        }else{
            System.out.println(firstNum/secondNUm);
        }
        System.out.println("Would you like to continue?");
        String answer=scan.next();
        while (answer.equals("yes")){
            System.out.println("Enter your first number");
             firstNum=scan.nextInt();
            System.out.println("Enter a math operator");
            mathOp=scan.next().charAt(0);
            System.out.println("Enter your second number");
            secondNUm=scan.nextInt();
            if(mathOp=='+'){
                System.out.println(firstNum+secondNUm);
            }else if(mathOp=='-'){
                System.out.println(firstNum-secondNUm);
            }else if(mathOp=='*'){
                System.out.println(firstNum*secondNUm);
            }else{
                System.out.println(firstNum/secondNUm);
            }
            System.out.println("Would you like to continue?");
            answer=scan.next();
        }
        System.out.println("Thank you using Cydeo calculator");
        scan.close();

    }
}
/*
3. Write a program that can calculate two numbers.
1. Ask user to enter the first number
2. Ask user to enter a math operator (+,-
,/,*)
(if user enters any invalid operator,
repeat this step until user provides a valid operator)
3. Ask user to enter the second number
4. Display the result
5. Ask user if they want to continue?
(yes/no)
if yes ==> repeat the entire steps
if no ==> print "Thanks for using Cydeo
calculator!"
If user enters any invalid entry,  ask
the user to re-enter until user provides a valid entry
 */
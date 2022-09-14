package day19_LoopPractices;

import java.util.Scanner;

public class PracticeTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("Enter the side of the square: ");
            double sideSquare=scan.nextDouble();
            if(sideSquare<=0){
                System.out.println("Invalid entry for the side of the square!!!");
                System.exit(0);
            }

            double areaSquare=sideSquare*sideSquare;
            double perimeterSquare=sideSquare*4;

            System.out.println("perimeterSquare = " + perimeterSquare);
            System.out.println("areaSquare = " + areaSquare);


            System.out.println("Would you like to calculate another square? ");
            String answer=scan.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid entry, please re-enter: ");
                answer=scan.next().toLowerCase();

            } if(answer.equals("no")){
                System.out.println("Thank you for using the Cydeo square calculator APP!!!");
               break;
            }
        }


        scan.close();
    }
}
/*
2. Write a program that can calculate the area and perimeter of a
Square:
1. Ask the user "Enter the side of the
square:"
if user enters 0 or negative numbers,
terminate the program after displaying the error message "Invalid Entry
for the side of the square"
2. Display:
1. Area of square
2. Perimeter of square
3. Ask the user "Would you like to calculate
another Square?"
If "yes" --> repeat the
previous steps
If "No" --> Print "Thank you
for using Cydeo Square Calculator APP"
If user enters an invalid entry, ask
the user to re-enter until user provides a valid entry
 */
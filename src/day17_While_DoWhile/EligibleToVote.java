package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {
// while loop is a repeated if statement

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scan.nextInt(); // valid age: 1-120;

        while( !(age>=1 && age<=120)){ // while the age number if invalid
            System.out.println("Invalid entry, please re-enter");
            age=scan.nextInt();
        }


        System.out.println("Are you a U.S citizen?");
        String answer=scan.next();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){


            System.err.println("Please enter a valid answer");
            answer=scan.next().toLowerCase();

        } if(answer.equalsIgnoreCase("yes")&& age>=20){
            System.out.println("You are eligible to vote!");
        } else{
            System.out.println("you are not eligible to vote!");
        }




    }
}

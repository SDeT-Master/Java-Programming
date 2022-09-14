package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        while(true) {

            System.out.println("Enter a number");
            int num = scan.nextInt();


            if (num % 2 == 0) {
                System.out.println(num + " Even number");
            } else {
                System.out.println(num + " Odd number");
            }


            System.err.println("Would you like to enter another number?");
            String answer = scan.next().toLowerCase();


            while(!(answer.equals("yes")|| answer.equals("no"))){
                System.err.println("Please re enter!!!");
                answer = scan.next().toLowerCase();

            }




            if(answer.equals("no")){
                break;

            }

        }


    }
}



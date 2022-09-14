package day14_String;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email=scan.nextLine();

        if(email.contains("_")) {
            String replace1 = email.substring(0, email.indexOf("_"));   // mike
            String replace2 = email.substring(email.indexOf("_") + 1, email.indexOf("@")) + "_"; // tyson_
            String replace3 = email.substring(email.indexOf("@")); //@gmail.com


            System.out.println(replace2 + replace1 + replace3);
        } else{
            System.out.println(email);
        }
    }

}


/*
8. Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that can swap first name with last name in the
email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input
email.
Ex:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
 */
package day14_String;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email=scan.nextLine();

        String firstName=email.substring(email.indexOf(0)+1,email.indexOf("_")); // defne
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));// kil
        String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));// domain

        System.out.println("First name: " + firstName.substring(0,1).toUpperCase()+firstName.substring(1));
        System.out.println("Last name: " + lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain: " + domain);

    }
}
/*
9. Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */
package Replit_Tasks;

import java.util.Scanner;

public class ReplitEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName; // temp variable to store firstname
        String lastName; // temp var to store the last name
        String domainName; // temp var to the domian name

        firstName =email.substring(email.indexOf(0)+1,email.indexOf("_"));
        // email.index of 0 +1 gives me the string starting from first letter and stops at the underscore

        lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));

        // last name starts at the letter after underscore and tops at the at@

       domainName=email.substring(email.indexOf("@")+1,email.indexOf("."));

       // domain name starts at @ and stops at .

        System.out.println("firstName = " + firstName.substring(0,1).toUpperCase()+firstName.substring(1));
        System.out.println("lastName = " + lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("domainName = " + domainName);


        /*
        Input: craig_federighi@apple.com


        Output:
First name: Craig
Last name: Federighi
Domain: apple
         */

    }
}
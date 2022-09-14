package day13_StringClass;

import java.util.Scanner;

public class ReturnInitials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String fistName=scan.nextLine();
        System.out.println("Enter your last name");
        String lastName=scan.nextLine();
        String result=fistName.charAt(0)+"."+lastName.charAt(0);
        System.out.println(result.toUpperCase());
    }
}

/*
4. write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output
 */
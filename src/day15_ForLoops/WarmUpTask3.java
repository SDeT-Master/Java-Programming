package day15_ForLoops;

import java.util.Scanner;

public class WarmUpTask3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=scan.next().toLowerCase();
        System.out.println("Enter your last name: ");
        String lastName=scan.next().toLowerCase();

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        System.out.println(firstName+" "+lastName);
    }
}
/*
3. Write a program that asks user to enter first and last names, and
then prints the full name in regular format (first character in upper
case)
input:
firstName = "cyDEo"
lastName = "SCHOOL";
output:
Cydeo School
 */
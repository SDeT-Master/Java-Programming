package day14_String;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class GetEmail_Domain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your email:");
        String email= scan.nextLine();

        int beginIndex=email.indexOf("@")+1;
        int endIndex=email.lastIndexOf(".");

       email=email.substring(beginIndex,endIndex);

        System.out.println("email domain: "+email);


    }
}
/*
1. Write a program that can gte the domain of the email. ( Assume that a
valid email is given)
Ex:
email = Cydeo.School@gmail.com
output:
gmail
email = "School.Cydeo@yahoo.com
output:
yahoo
 */
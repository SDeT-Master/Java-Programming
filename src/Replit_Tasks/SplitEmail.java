package Replit_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        if((email.contains("@")))
        {
            String[] result = email.split("@");
            if(result.length>2) {
                System.out.println("invalid email");
                System.exit(0);
            }
            {
                System.out.println("Email id: " + result[0]);
                System.out.println("Email domain: " + result[1]);}
        }else{
        System.out.println("invalid email");
        System.exit(0);
    }}}

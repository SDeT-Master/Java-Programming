package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn_WhileLoop {
    public static void main(String[] args) {

        // username: "Cydeo"
        // password: "Cydeo123"


        // while it is  && hasAttempts left

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your username:");
        String u=scan.next();

        System.out.println("Enter your password:");
        String p=scan.next();


        if(u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{   // if credentials are not valid, the user has three attempts
           int attempts=3;
            while(!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts>0){ // while credentials are invalid and user has

                if(attempts==1){
                    System.out.println("This is your last chance!");
                }


                System.out.println("Incorrect Username or Password, please re-enter again");
                System.out.println("Enter your username");
                u=scan.next();


                System.out.println("Enter your password:");
                p=scan.next();
                attempts--;

            }
            if(u.equals("Cydeo") && p.equals("Cydeo123")){
                System.out.println("logged in");
            } else{
                System.out.println("your account is locked");
            }


        }
        scan.close();

    }
}

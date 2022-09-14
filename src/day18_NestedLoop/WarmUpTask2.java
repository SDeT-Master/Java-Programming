package day18_NestedLoop;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username=scan.nextLine();
        System.out.println("Enter your password: ");
        String password=scan.nextLine();
        int attempts=3;
        for (int i = 1; i < 3; i++) {
            attempts--;
            if(!(username.equals("Cydeo") && password.equals("WoodenSpoon"))){

                if(attempts==0){
                    throw new RuntimeException("Your account is locked");
                }
                System.out.println("Please try again and you have "+attempts+" attempts left");

                System.out.println("Enter your username: ");
                username=scan.nextLine();
                System.out.println("Enter your password: ");
                password=scan.nextLine();
            }
        }
        if((username.equals("Cydeo") && password.equals("WoodenSpoon"))){
            System.out.println("logged in");
        }
    scan.close();
    }
}

/*
2. You are writing a code for the log-in function of the Cydeo
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials.
If credentials are matched, your program should
print "Logged in."
If the credentials are not matched, the program
should allow the user to have three attempts to enter correct credentials
and if all three attempts are failed, then print "Your account is locked."
Nested loop:  loop inside another loop (inner & outer loops)
one iteration of the outer loop, executes all the iteration of the
inner loop
 */
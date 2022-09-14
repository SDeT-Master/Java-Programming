package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);



        System.out.println("Enter your user name");
        String userN=scan.next();


        System.out.println("Enter your password");
        String passW=scan.next();


        if(userN.equals("Cydeo") && passW.equals("WoodenSpoon")){
            System.out.println("Logged In");

        }else{

            for (int i = 0; i < 2; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your username:");
                userN=scan.next();
                System.out.println("Enter your password");
                passW=scan.next();



                if((userN.equals("Cydeo") && passW.equals("WoodenSpoon"))) {
                    System.out.println("Logged in");
                    break;


                }


            }

            if(!(userN.equals("Cydeo") && passW.equals("WoodenSpoon"))){
                System.err.println("Your account is locked, please contact support team");
            }


        }


scan.close();



    }
}

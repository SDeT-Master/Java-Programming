package day17_While_DoWhile;

import java.util.Scanner;

public class LogInLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your username");
        String username=scan.nextLine();

        System.out.println("Enter your password");
        String password=scan.nextLine();
        int valid=3;

        if(username.equals("Cydeo") && username.equals("Cydeo123")){
            System.out.println("Logged-in");
        }else{
            while (!(username.equals("Cydeo") && username.equals("Cydeo123"))&&valid>0){
                if(valid==1){
                    System.err.println("This is your last chance!");
                }
                System.out.println("Incorrect username or password, please re-enter your credentials: ");
                System.out.println("Enter your username");
                username=scan.nextLine();


                System.out.println("Enter your password");
                password=scan.nextLine();
                valid--;
            } if(username.equals("Cydeo") && username.equals("Cydeo123")){
                System.out.println("Logged in");
            }else{
                System.out.println("Your account is locked, please contact support team");
            }
        }

scan.close();
    }
}
/*2. You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: Cydeo123
Ask the user to enter their credentials.
If credentials are matched, your program should print
"Logged in."
If the credentials are not matched, the program should
allow the user to have three attempts to enter correct credentials and if
all three attempts are failed, then print "Your account is locked."
for(int i = 1; i <= 3; i++){
if(valid){
sout("Loged In")
break;
}
if( i==3){
sout(Your account is locked)
}
}

 */
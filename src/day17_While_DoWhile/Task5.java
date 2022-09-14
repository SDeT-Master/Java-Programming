package day17_While_DoWhile;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int total=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Would you like to reserve a room? ");
        String yesOrNo=scan.nextLine();
        if(yesOrNo.equals("no".toLowerCase())){
            System.out.println("Have a nice day!");
            return;
        }else {

            System.out.println("which room would you like to reserve?");
            System.out.println("\tKing Bed ==> 120$");
            System.out.println("\tQueen Bed ==> 100$");
            System.out.println("\tsingle Bed ==> 80$");
            String word = scan.nextLine().toLowerCase();
            while (!(word.equals("king bed") || word.equals("queen bed") || word.equals("single bed"))) {
                System.out.println("Invalid entry please re-enter!");
                word = scan.nextLine().toLowerCase();
            }

            total += (word.equals("king bed") ? 120 : (word.equals("queen bed") ? 100 : 80));

            System.out.println("Your total price is: $" + total);
        }
    }
}
/*
5. Create a class called RommReservation, write a program for the room
reservation, your program asks the user wants to reserve a room.
if user entered yes, then ask which type of room the user
wants to reserve. if user entered no, print "have a nice day"
(if user entered any invalid answer (other
than yes/no) ask user to reenter until user provides a valid entry)
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
the program should be able to display the room he/she reserved
and total price of the room.
(if the user selected an invalid room, ask the user to
reselect the room until user provides a valid entry)
 */
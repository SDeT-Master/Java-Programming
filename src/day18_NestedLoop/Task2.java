package day18_NestedLoop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Which bedroom do you want to reserve ?\n");
        System.out.println("\tKing Bed ==> 120$");
        System.out.println("\tQueen Bed ==> 100$");
        System.out.println("\tSingle Bed ==> 80$");
        System.out.println("------------------------------------------");
        String bedroomType=scan.nextLine().toLowerCase();
        System.out.println("How many nights ? ");
        int numberOfNights=scan.nextInt();
        int total=0;

        while (!(bedroomType.equals("King Bed")|| bedroomType.equals("Queen Bed")||bedroomType.equals("Single Bed"))){
            System.out.println("Would you like to reserve another room?");
            String yesOrNo=scan.next();
            if(yesOrNo.equals("yes")){
                System.out.println("Which bedroom do you want to reserve ?\n");
                System.out.println("\tKing Bed ==> 120$");
                System.out.println("\tQueen Bed ==> 100$");
                System.out.println("\tSingle Bed ==> 80$");
                System.out.println("------------------------------------------");
                 bedroomType=scan.nextLine().toLowerCase();
                 scan.nextLine();
                System.out.println("How many nights ? ");
                 numberOfNights=scan.nextInt();
            } else {
                total += (bedroomType.equals("king bed") ? 120 : bedroomType.equals("queen bed") ? 100 : 80);
                System.out.println("Your total is $"+total*numberOfNights);
                return;
            }
            }
        scan.close();

        }
}

/*
2. Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
 */
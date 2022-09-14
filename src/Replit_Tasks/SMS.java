package Replit_Tasks;

import java.util.Scanner;

public class SMS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender=message.substring(message.indexOf("<")+1,message.indexOf(">"));
        phoneNumber=message.substring(message.indexOf("[")+1,message.indexOf("]"));
        messageBody=message.substring(message.indexOf("{")+1,message.indexOf("}"));

        System.out.println("sender = " + sender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("messageBody = " + messageBody);
        /*
        Given a String message in the following format:
        Sender:<Mike Smith>. From Number:[202-123-3456].
        Message:{I love programing and problem solving}
        assign the value of the sender, phoneNumber, and messageBody variables and print them.

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
         */




    }

}

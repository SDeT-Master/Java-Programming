package day14_String;

import java.util.Scanner;

public class StringTask_2 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String word="";
        word=scan.next();

        if(word.substring(word.length()-2).equals("ly")) {

            System.out.println("Really");
        } else{

            System.out.println("Never Mind");
        }
        scan.close();

    }
}


/*
2. ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
 */
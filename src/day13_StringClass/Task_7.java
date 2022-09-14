package day13_StringClass;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first word");
        String firstWord=scan.next();
        System.out.println("Enter your second word");
        String secondWord=scan.next();
        System.out.println("Enter your third word");
        String thirdWord=scan.next();

        if(firstWord.length()==secondWord.length() && secondWord.length()==thirdWord.length()){
            System.out.println("ALl words are same length");
        } else if(firstWord.length()==secondWord.length() && secondWord.length()!=thirdWord.length() ||
        firstWord.length()!=secondWord.length() && secondWord.length()==thirdWord.length()){
            System.out.println("Not same nor different length");
        } else if(firstWord.length()!=secondWord.length() && secondWord.length()!=thirdWord.length()){
            System.out.println("All different length");
        }


    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
 */
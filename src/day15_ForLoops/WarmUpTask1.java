package day15_ForLoops;

import java.util.Scanner;

public class WarmUpTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        scan.close();
        if(word.charAt(0)=='x'){
            System.out.println(word.replace('x','a'));
        }else{
            System.out.println(word);
        }
    }
}

/*
1. Write a program that asks user to enter a word. If the work
starts with x, replace it with a.
Input:
xcodex
Output:
acodex
 */
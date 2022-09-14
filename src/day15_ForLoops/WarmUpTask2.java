package day15_ForLoops;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        System.out.println(word.replace('x','a'));
    }
}

/*
2. Write a program that asks user to enter a word. and replace all
the x or X with character a
Input:
xcodeX
Output:
acodea
 */
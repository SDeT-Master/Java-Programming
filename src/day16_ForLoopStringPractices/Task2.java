package day16_ForLoopStringPractices;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.nextLine();
        System.out.println("Enter a char: ");
        char ch=scan.next().charAt(0); // To read a char, we use scan.next().charAt(0);
        scan.close();
        int count=0;
        String allChar="";
        String unique="";

        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if(each==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
2. Write a program that asks user to entera string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
 */
package day13_StringClass;

import java.util.Scanner;

public class FirstLastCharsSame {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence=scan.nextLine();
        if(sentence.charAt(0)==sentence.charAt(sentence.length()-1)){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}

/*
3. write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */
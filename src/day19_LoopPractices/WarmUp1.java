package day19_LoopPractices;

import java.util.Scanner;

public class WarmUp1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string of characters: ");
        String str=scan.nextLine();
        String chars="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char each=str.charAt(j);
                if(ch==each){
                    count++;
                }
            }
            if(chars.contains(""+ch)){
                continue;
            }
            chars+=ch;
            chars+=count;
        }
        System.out.println(chars);
        scan.close();
    }
}
/*
1. Write a program that can find the frequency of the characters
from a string
 Ex:
str = "aabcccd";
output:
a2b1c3d1
 */
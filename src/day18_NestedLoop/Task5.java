package day18_NestedLoop;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string of characters: ");
        String str=scan.nextLine();
        String unique="";
        for (int i = 0; i <str.length(); i++) {
            char ch=str.charAt(i);
            int frequency=0;
            for (int j = 0; j <str.length() ; j++) {
                char each=str.charAt(j);
                if(ch==each){
                    frequency++;
                }
                if(unique.contains(""+ch)){
                    continue;
                }
            }
            if(frequency==1){
                unique+=ch;
            }
        }
        System.out.println(unique);

    }
}
/*
5. Write a program that can find the unique characters from a string
without using index() and lastIndexOf() methods
Ex:
str = "aabccdeef";
output:
bdf
Hint: if you find out how to find the frequency of one
character, then you can repeat it for the remaining characters to find the
frequency.
if frequency of a character == 1  =========>
unique
 */
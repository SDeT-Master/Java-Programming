package day18_NestedLoop;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string of chars");
        String sentence=scan.nextLine();
        String result="";

        for (int i = 0; i < sentence.length(); i++) {
            char ch=sentence.charAt(i);
            int frequency=0;
            for (int j = 0; j < sentence.length(); j++) {
                char each=sentence.charAt(j);
                if(ch==each){
                 frequency++;
                }

                }
            if(result.contains(""+ch)){
                continue;
            }

            result+=ch;
            result+=frequency;
        }
        System.out.println(result);
scan.close();
    }
}




/*
4. Write a program that can find the frequency of the characters from a
string
 Ex:
str = "aabcccd";
output:
a2b1c3d1
Hint: if you find out how to find the frequency of one
character, then repeat it for all the remaining characters
 */
package day19_LoopPractices;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string of chars:" );
        String str=scan.nextLine();
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char char1=str.charAt(i);
            int count=0;

            for (int j = 0; j < str.length(); j++) {
                char char2=str.charAt(j);
                if(char1==char2){
                    count++;
                }
            }
            if(result.contains(""+char1)){
                continue;
            }
            if(count==1){
                result+=char1;
            }
        }
        System.out.println(result);
    }
}
/*
2. Write a program that can find the unique characters from a string
without using indexOf() and lastIndexOf() methods
Ex:
str = "aabccdeef";
output:
bdf
 */
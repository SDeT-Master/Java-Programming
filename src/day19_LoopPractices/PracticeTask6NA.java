package day19_LoopPractices;

import java.util.Scanner;

public class PracticeTask6NA {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=scan.nextLine();
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch1=str.charAt(i);
            int count=0;
            int max=str.length();
            for (int j = 0; j < str.length(); j++) {
                char ch2=str.charAt(j);
                if(ch1==ch2){
                    count++;
                }
            }
            if(result.contains(""+ch1)){
                continue;
            }
            if(count<max){
                max=count;
                result+=ch1;
            }

        }
        System.out.println(result);
    }
}
/*
6.  Write a program that can find the character that has the highest
frequency from a string
 */
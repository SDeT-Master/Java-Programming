package day19_LoopPractices;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=scan.nextLine();
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch1=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char ch2=str.charAt(j);
                if(ch1==ch2){
                    count++;
                }
            }
            if(result.contains(""+ch1)){
                continue;
            }
            if(count==1){
                result+=ch1;
            }
        }
        System.out.println(result);
        scan.close();
    }
}

/*
4. Write a program that can return the index number of the first
unique character.
 */
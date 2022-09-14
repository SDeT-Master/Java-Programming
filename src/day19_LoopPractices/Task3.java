package day19_LoopPractices;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=scan.nextLine();
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                char ch2=str.charAt(j);
                if(ch==ch2){
                    count++;
                }
            }
            if(result.contains(""+ch)){
                continue;
            }
            if(count==2){
                result+=ch;
            }
        }
        System.out.println(result);
        scan.close();
    }
}

/*
3. Write a program that can display all the characters that appeared
twice in the string.
 */
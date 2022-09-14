package day16_ForLoopStringPractices;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String sentence="Java Java";
        int count=0; // I use it to count and increase each time the word java occurs

        for (int i = 0; i <= sentence.length()-4; i++) {
            String newSentence=sentence.substring(i,i+4);
            if(newSentence.equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
4. write a program that can return the frequency of the word Java from
the sentence
Ex:
sentence = "Java Java";
output:
2
Hint: you need to create
 */
package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfJava {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence to find out how many times the word java occurred: ");
        String str=scan.nextLine();
        int count=0;
        for (int i = 0; i <= str.length()-4; i++) {
            String sen=str.substring(i,i+4);
            if(sen.equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
2. write a program that can return the frequency of the word Java
from the sentence
Ex:
sentence = "JavaJavaJava";
output: 3
Str = "JavaJava";
substrings:
1. Java  //substring(0, 4)
2. avaJ  //substring(1, 5)
3. vaJa  // substring(2, 2+4 )
4. aJav  // substring(3, 3+4)
5. Java  // substring(4, 4+4)

Str = "Java Java Java Python"
Delete 1st Java:
" Java Java Python"
Delete 2d Java:
" Java Python"
Delete 3rd Java:
"  Python"
 */
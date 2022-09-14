package day16_ForLoopStringPractices;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string to get the unique letters");
        String str=scan.nextLine();
        String unique="";
        String chars="";
        for (int i = 0; i < str.length(); i++) {
            chars=""+str.charAt(i);
            if(!unique.contains(chars)){
                unique+=chars;
            }
        }

        System.out.println(unique);

        }
}

/*
2. Write a program that can remove the duplicated characters from a
String
Ex:
input:
AABBCCBC
Output:
ABC
Hint: You can add each characters of the
string into another String
  Condition: the character is not
contained in the other String yet before you are adding
 */
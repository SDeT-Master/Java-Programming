package day16_ForLoopStringPractices;

import javax.script.ScriptContext;
import java.util.Scanner;

public class ReverseWarmUp1 {
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
       // String input=scan.nextLine();

        String result="Wooden Spoon";

        String result1="";


        for (int i =result.length()-1; i>=0 ; i--) { //

            result1+=result.charAt(i);
        }

        System.out.println(result1);


    }
}

/*
1. Write a program that can reverse a String
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */
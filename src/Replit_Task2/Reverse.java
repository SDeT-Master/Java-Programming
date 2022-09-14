package Replit_Task2;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        String sentence=" Java is fun";
        String reversed="";

        String[]result= sentence.split(" ");
        for (int i = result.length-1; i >=0 ; i--) {
           reversed+= result[i]+" ";
        }
        reversed=reversed.substring(0,reversed.length()-1);

        System.out.println(reversed);
    }
}

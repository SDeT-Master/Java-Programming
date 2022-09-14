package day15_ForLoops;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Numbers and Letters: ");
        String str=scan.nextLine();
        scan.close();

        String digit="";
        String letters="";

        int sum=0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                digit+=str.charAt(i);

            }else{
                letters+=str.charAt(i);
            }
        }

        for (int i = 0; i <= digit.length(); i++) {
            sum+=i;

        }

        System.out.println("sum = " + sum);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digit);
    }
}

/*
6. Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
 */
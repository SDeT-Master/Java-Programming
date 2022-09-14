package Replit_Tasks;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        reverse(scan.nextLine());

    }
    public static void reverse(String str){

        for (int i = str.length()-1; i >=0 ; i--) {
            char alpha=str.charAt(i);
            if(alpha>=65 && alpha<=90 || alpha >=97 && alpha<=122){
                System.out.print(alpha);
            }
        }
    }

}

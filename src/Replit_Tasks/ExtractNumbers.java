package Replit_Tasks;

import java.util.Scanner;

public class ExtractNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
         extractNums(scan.next());
    }
    public static String extractNums(String nums){

        for (int i = 0; i < nums.length(); i++) {
            char ch=nums.charAt(i);
            if(ch>=48 && ch<=57)
            System.out.print(ch+" ");
        }
        return nums;
    }



}

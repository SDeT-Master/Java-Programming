package Replit_Task2;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord2 {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        String str=scan.nextLine();




        String[]arrString=str.split(", ");

        String smallWords="";
        String small=arrString[0];



        for (int i = 0; i < arrString.length; i++) {
            if(arrString[i].length()<small.length()){
                small=arrString[i];
            }
        }
        for (int i = 0; i < arrString.length; i++) {
            if(arrString[i].length()==small.length()){
                smallWords+=arrString[i]+", ";
            }
        }

        String shortestWords[]=smallWords.split(", ");
        Arrays.sort(shortestWords);
        System.out.println(Arrays.toString(shortestWords));


        scan.close();
    }
}

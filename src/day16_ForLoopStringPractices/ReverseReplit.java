package day16_ForLoopStringPractices;

import java.util.Scanner;

public class ReverseReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        String result = "";


        for (int i = word.length() - 1; i >= 0; i--)
            result += word.charAt(i);

            if (result.length() == 5)

                System.out.println("result : " + result);


           else if (result.length() <=4 )
                System.out.println("Too Short");
            else
                System.out.println("Too long");

    }}
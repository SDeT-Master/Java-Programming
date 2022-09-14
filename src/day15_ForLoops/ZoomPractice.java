package day15_ForLoops;

import java.util.Scanner;

public class ZoomPractice {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double givenNumber =scan.nextInt();

        double result=1;

        for (double i = givenNumber ; i >0; i--) {

            result*=i;


        }
        System.out.println("result = " + result);
    }
}

/*4. Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */
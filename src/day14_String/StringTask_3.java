package day14_String;

import java.util.Scanner;

public class StringTask_3 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String word="" ;
        word=scan.next();
        System.out.println(word.replace("x",""));

    }
}

/*3. Ask user to enter a word. If the work starts with x, print the
word without x.
Input:
xcode
Output:
code

 */
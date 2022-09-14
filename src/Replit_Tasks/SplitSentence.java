package Replit_Tasks;

import java.util.Arrays;

public class SplitSentence {
    public static void main(String[] args) {

        String s="i love java";

        String[] store=s.split(" "); // here I can store String into Array, because Array has the split method

        for (String each : store) {

            System.out.println(each);
        }




    }
}

package day17_While_DoWhile;

import jdk.swing.interop.SwingInterOpUtils;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "AAABBBCAAAA";
        char ch='A';


        int frequency=0; // +1 +1 +1 ==>3


        for (int i = 0; i < str.length() ; i++) { // i ; indexes of str

            char eachChar=str.charAt(i);  // eachChar : ach character of str

             // 'A'== 'A'
            if (ch == eachChar) { // if given ch is matching the eachchar, then ch is apperaed in the string
                frequency++;

            }

        }
        System.out.println(frequency);

    }
}
/*1. Write a program that can return the frequency of a char from a
        String
        Ex:
        str = "AAABBBC"
        ch = 'A'
        Output:
        3

 */
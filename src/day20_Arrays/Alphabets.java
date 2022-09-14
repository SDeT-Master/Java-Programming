package day20_Arrays;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[] alphabet = new char[26];



        /*
        alphabet[0]='Z';
        alphabet[1]='Y';
        alphabet[2]='X';

         */


        for (char i = 0, j = 'Z'; i < alphabet.length; i++, j--) {

        alphabet[i]=j;
        }

        System.out.println(Arrays.toString(alphabet));
    }
}
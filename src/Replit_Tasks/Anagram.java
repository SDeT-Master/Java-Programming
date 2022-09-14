package Replit_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String words=scan.nextLine();
        String word2=scan.nextLine();
        System.out.println(isAnagram(words,word2));

    }


    public static boolean isAnagram(String word1, String word2){

        char[]result=word1.toCharArray();
        char[]result2=word2.toCharArray();
        Arrays.sort(result);
        Arrays.sort(result2);
       boolean anagram= Arrays.equals(result,result2);
        return anagram;

    }
}


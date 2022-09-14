package Replit_Tasks;

import java.util.Arrays;

public class LongestWord {
    public static void main(String[] args) {

        String[] word={"defne","jack","christine","daniel","roc","Fdsafjdaskfjdlskfjlads"};

        int max=0;

        for (int i = 0; i < word.length; i++) {

            if(word[max].length()< word[i].length()){
                max=i;
            }
        }
        System.out.println(word[max]);

    }
}

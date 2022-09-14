package Replit_Tasks;

import java.sql.Array;
import java.util.Arrays;

public class FirstThreeLetters {
    public static void main(String[] args) {
        String[] words={"James","Helen","Lambo","Vivian","Christine","Enver"};
        String result="";
        for (String word : words) {
            for (int i = 0; i <word.length() ; i++) {
                result=word.substring(0,3);

            }
            System.out.println(result);
        }








    }
}

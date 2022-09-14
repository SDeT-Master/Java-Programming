package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str="aaaabbbcccjklsdffffffjjjjjjjkkkkkkkk";
        //str.split(" ");  // returns a String list
        ArrayList<String> list= new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("list = " + list);

        String unique="";
        for (String eachElement : list) {
            int frequency=Collections.frequency(list,eachElement);
            if(frequency==1){
                unique+=eachElement;
            }
        }

        System.out.println("unique = " + unique);

    }
}

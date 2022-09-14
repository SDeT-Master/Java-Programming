package day16_ForLoopStringPractices;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String str="woodennnn";
        String allChars="";
        String unique="w";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            allChars+=str.charAt(i);
            if(allChars.contains(unique)){
                count++;
            }

        }
        System.out.println(count);

            }
        }



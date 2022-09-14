package day13_StringClass;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {


        String word="Cydeo";

        char thirdCharacter=word.charAt(3);

        System.out.println(thirdCharacter);


        System.out.println("=======================================================");


        String str1="Batch EU9 is the best batchfda";

        int total=str1.length();

        System.out.println(total);

        char lastChar=str1.charAt(str1.length()-1);

        System.out.println(lastChar);


        System.out.println("-------------------------------------------------");


        String str="wooden spoon";
        str=str.toUpperCase();


        System.out.println(str);


        System.out.println("----------------------------------");
        String s="Java";
        s=s.toUpperCase();
        System.out.println(s);

        System.out.println("----------------------------------------------------------------------------------");

        String sentence="Today is a great to learn Java programming language";
        sentence=sentence.toUpperCase();
        System.out.println(sentence);



    }
}

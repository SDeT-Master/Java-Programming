package day01_JavaIntro;
import utilities.StringUtility;
import day24_Custom_Methods_Return.ReturnMethodIntro;
import day24_Custom_Methods_Return.ReturnMethodPractice4;

public class Test {

    public static void main(String[] args) {

        String str="aaaaaaaabbbbbbbbbbb";


      str=  ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);


        String name="Java Programming";

       name= ReturnMethodIntro.reverse(name);

        System.out.println(name);

       String str1="Wooden Spoon";
       StringUtility.printEachChar(str1);


    }


}

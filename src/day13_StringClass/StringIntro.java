package day13_StringClass;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {



        String name="Wooden Spoon";
        String name2="Wooden Spoon";
        String name3="Wooden Spoon";
        String name4="Wooden Spoon";


        System.out.println(name==name2); // true
        System.out.println(name2==name3); // true
        System.out.println(name3==name4);// true


        System.out.println("===================================================");



        String str1= new String("Wooden Spoon");
        String str2= new String("Wooden Spoon");
        String str3= new String("Wooden Spoon");
        String str4= new String("Wooden Spoon");


        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str3==str4);

        System.out.println("===================================");



        String s1="Java";
        String s2= new String("Java");

        System.out.println(str1.equals(str2));


    }

    public static class FindTheMiddleOne {
        public static void main(String[] args) {


            Scanner scan=new Scanner(System.in);
            String word = scan.next();


            boolean evenOrOdd=word.length()%2==0;

           if(evenOrOdd==false) {
               if (word.length()>= 3) {
                   System.out.println(word.substring(word.length()/2,word.length()/2+1));

               } else{
                   System.out.println(word.repeat(3));


               }


           } else {
               if(word.length()>=4){
                   System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
               } else{

                   System.out.println(word.repeat(2));
               }

           }


        }
    }
}

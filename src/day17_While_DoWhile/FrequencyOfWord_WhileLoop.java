package day17_While_DoWhile;

import java.util.Locale;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str="Java Java Python java Java Python";

        int frequency=0;

        while (str.contains("Java")){

          str= str.replaceFirst("Java","");
          frequency++;
        }

        System.out.println("frequency = " + frequency);


        System.out.println("-----------------------");



              String  sentence="Cat cat Cat dog cat dog cat Cat";
              sentence=sentence.toLowerCase();

        int countCat=0;


        while(sentence.contains("cat") ){
          sentence=sentence.replaceFirst("cat","");
            countCat++;

        }

        System.out.println("countCat = " + countCat);

        System.out.println("-----------------------");


        String s="Java Java python java java Java python";
        s=s.toLowerCase();

        int countJava=0;
        int countPython=0;

        while(s.contains("Java")||s.contains("python"))

            if(s.contains("Java")){
                s=s.replaceFirst("java","");
                countJava++;}


            if(s.contains("python")){
                s=s.replaceFirst("python","");
                countPython++;}


        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);

    }
}


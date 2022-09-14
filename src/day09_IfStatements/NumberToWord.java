package day09_IfStatements;

public class NumberToWord {

    public static void main(String[] args) {



        String numToWord;

        int n=8;

        if(n==1){
            numToWord="One";
        } else if (n==2) {
            numToWord="Two";

        }

        else if(n==3){
            numToWord="Three";
        } else if (n==4) {

            numToWord="Four";

        }


        else if(n==5){

            numToWord="Five";
        }


        else if(n==6){

            numToWord="Six";
        }

        else if(n==7){

            numToWord="Seven";
        }


        else if(n==8){
            numToWord="Eight";
        }

        else {
            numToWord="Nine";
        }



        System.out.println(n+ " in word is: "+numToWord);
    }
}

/*1. Create a class called NumberToWord, and write a java program that can
convert numbers between 0 ~ 9 to words
Ex:
number = 1;
output:
One

 */
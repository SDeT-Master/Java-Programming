package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {


        // > >=, < , <=


        boolean result1= 20>40; // false

        System.out.println("result1 = " + result1); // false



        boolean result2=300>=150;

        System.out.println("result2 = " + result2);


        boolean result3 =100>=100;

        System.out.println("result3 = " + result3);


        boolean result4= 300>=500;

        System.out.println("result4 = " + result4);




        //credit score of 720

        int creditScore= 745;

        boolean isElligibleForLoan= creditScore>=720;  // if the credit score is 720 or  equal then the person is eligible

        System.out.println("isElligibleForLoan = " + isElligibleForLoan);

boolean result5=100<120;

        System.out.println("result5 = " + result5);



        boolean result6=200<180;
        System.out.println("result6 = " + result6);



        int score= 60;

        boolean hasFailed=score<=59;

        System.out.println("hasFailed = " + hasFailed);


        boolean result7= 40<=60;

        System.out.println("result7 = " + result7);


        System.out.println("\n\n\n");




        // in OR statement, we will get true as long as one statement is true!


        int x=100;

        int y=200;

        boolean equal= x==y;   // in order to compare we should use two== not =

        System.out.println("equal = " + equal);




        boolean result8= "Muhtar"=="Good guy"; // false


        System.out.println("result8 = " + result8);

boolean result9='A'=='a';

        System.out.println("result9 = " + result9);


        boolean result10="Java"=="Java";

        System.out.println("result10 = " + result10);

        System.out.println("----------------------------------------------------------------");


        boolean result11=100!=200; // true


        System.out.println("result11 = " + result11);


        boolean result12= "Java"!="Break";
        System.out.println("result12 = " + result12);



        boolean result13= 300!=300;
        System.out.println("result13 = " + result13);








    }
}

package day07_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {


        //Assignment: =  we use assignment to update the variables


        int num=100;

        System.out.println(num); // 100

        num=200;

        System.out.println(num);


        String word="javaProgramming";


        System.out.println("word = " + word); // JavaProgramming

        word="My name is JACK";

        System.out.println("word = " + word);// My name is Jack

        word="Cydeo";

        System.out.println("word = " + word);

// word= 123;   - we cant assign numbers to String

        word="JavaProgramming";
        System.out.println("word = " + word);


        word="Word World"+2+2;

        System.out.println("word = " + word);



// Variables are containers and assignments can help us replace what is within the container


        System.out.println("\n");



        int x=100;

        System.out.println(x);


        x=x+200;


        System.out.println("x = " + x);



        x +=400;


        System.out.println("x = " + x);



        String str="Wooden";


        str+="Spoon";


        System.out.println("str = " + str);


        double num1=2.5;

        System.out.println("num1 = " + num1);

        num1+=5.5;

        System.out.println("num1 = " + num1);


double availableBalance=1000.50;

availableBalance+=300; // assignment addition assignment


        System.out.println("availableBalance = " + availableBalance);


        System.out.println("\n" );



        //Withdraw 500 dollars from the account

        availableBalance-=500;

        System.out.println("availableBalance = " + availableBalance);

// withdrawing 200 dollars first and then depositing 400



        availableBalance-=200;
        System.out.println("availableBalance = " + availableBalance);

        availableBalance+=400;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("\n");


        double salary= 50000.50;


        salary*=2;

        System.out.println("salary = " + salary);



        double doge=0.00000001;

        doge*=1000000;


        System.out.println("doge = " + doge);


        System.out.println("\n");




        double num2=25000;


      //  num2=num2/2;

        num2/=2;

        System.out.println("num2 = " + num2);


        System.out.println("\n\n\n");



        double num3=100;


        num3%=3;

        System.out.println("num3 = " + num3);


        int amount=127; // cents

        int quarters=127/25;

        int cents=127%25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);


        System.out.println("\n");



        int cents2=127;

        cents2%=25;

        System.out.println("cents2 = " + cents2);





        int y=300;
        y%=16;

        System.out.println("y = " + y);



        int balance=3500;

        // insurance fee is 153



        balance%=153;

        System.out.println("balance = " + balance);





        // Remainder basically helps you find out the leftovers

        // Now I understand and know what Shorthand Operators are for











    }
}

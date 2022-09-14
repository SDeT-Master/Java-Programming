package day11_Switch_Scanner;

public class CappuccinoBuyerSwitch {

    public static void main(String[] args) {


        String size="venti";
        double price=0;
        int calories=0;
        String result="";


        switch (size){

            case "tall":
                price=3.69;
                calories=90;
                result="Size: "+size+ "\n"+"Pirce :$"+price+"\n"+"Calories :"+calories;
                break;


            case "grande":
                price=3.99;
                calories=120;
                result="Size: "+size+ "\n"+"Pirce :$"+price+"\n"+"Calories :"+calories;
                break;



            case "venti":
                price=4.29;
                calories=150;
                result="Size: "+size+ "\n"+"Pirce :$"+price+"\n"+"Calories :"+calories;
                break;

            default:
                result="Invalid Size or Entry";
                break;


        }

        System.out.println(result);



    }
}

/*
1. Create a class called  CappuccinoBuyer. A variable named Size is
given, write a program that can display the price and calories of
cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
price is $3.99;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
 */
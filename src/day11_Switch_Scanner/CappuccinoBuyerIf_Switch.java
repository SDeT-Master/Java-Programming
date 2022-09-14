package day11_Switch_Scanner;

public class CappuccinoBuyerIf_Switch {

    public static void main(String[] args) {

        String size="grande";
        double price=0;
        int calories=0;
        String result="";


        if (size=="tall" || size=="grande"||size=="venti"){

            switch (size){
                case "tall":
                    price=3.69;
                    calories=90;
                    result="Price :$"+price+"\n"+"Caloties :"+calories+"\n"+"Size :"+size;
                    break;


                case "grande":
                    price=3.99;
                    calories=120;
                    result="Price :$"+price+"\n"+"Caloties :"+calories+"\n"+"Size :"+size;
                    break;

                default:
                    price=4.29;
                    calories=150;
                    result="Price :$"+price+"\n"+"Caloties :"+calories+"\n"+"Size :"+size;
                    break;

            }





        }else{

            result="Invalid Size or Entry";
        }


        System.out.println(result);

    }

}

/*1. Create a class called  CappuccinoBuyer. A variable named Size is
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
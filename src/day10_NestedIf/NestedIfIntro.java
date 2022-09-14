package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 100;


        if (score >= 0 && score <= 100) {


            if (score >= 60) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }


        } else {

            System.out.println("Invalid Score");
        }


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");


        int age =1;


        boolean hasID = true;

        if (hasID) {    // if the person has ID

            if (age >= 25) {   // if the person is 25 years or older

                System.out.println("Eligible to buy alcohol");
            } else {   // if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }


        } else { // if the person doesnt have an idea
            System.out.println("You must have ID to buy alcohol");
        }


        System.out.println("-------------------------------------------------------------------------");



        int number =9;

        if (number>=1 && number<=7){

            if (number==1){

                System.out.println("Monday");
            }
            else if(number==2){
                System.out.println("Tuesday");
            }

            else if(number==3){
                System.out.println("Wednesday");
            }


            else if (number==4){

                System.out.println("Thursday");
            }

            else if(number==5){

                System.out.println("Friday");
            }

            else if (number==6){

                System.out.println("Saturday");
            }

            else {
                System.out.println("Sunday");
            }

        }else{

            System.out.println("Invalid Number");
        }



    }
}
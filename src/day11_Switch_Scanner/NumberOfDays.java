package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int year=2007;

        int number =1;

        String result="";

        if(number>=1 && number<=12){


            switch (number){

                case 2:
                   result= (year%4==0)?"29Days":"28Days";

                    /*if(year%4==0){
                        result="29Days";

                    }else {

                    result="28 Days";}
                    break;

                     */
                    break;


                case 4: case 6: case 9: case 11:
                    result="30 Days";

                default:
                    result="31 Days";
                    break;

            }

        }else{

            result="Invalid Number";

        }
        System.out.println(result);

    }
}

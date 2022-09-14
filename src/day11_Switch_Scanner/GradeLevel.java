package day11_Switch_Scanner;

public class GradeLevel {

    public static void main(String[] args) {


        byte grade=16;

        String result="";

        if(grade>=1 && grade<=18){

            switch (grade){
                case 1: case 2: case 3: case 4: case 5:
                    result="Elementary School";
                    break;


                case 6: case 7: case 8:
                    result="Middle School";
                    break;

                case 9: case 10: case 11: case 12:
                    result="High School";
                    break;


                case 13: case 14: case 15: case 16:
                    result="College";
                    break;

                default:
                    result="Grad School";
                    break;


            }



        }else{

            result="Invalid grade level";
        }


        System.out.println(result);


    }
}

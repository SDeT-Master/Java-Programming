package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {


        int grade=2;

        if(grade>=0 && grade<=100){
            if(grade>=90 && grade<=100){

                System.out.println("Excellent");
            }

            else if(grade>=80 && grade>=89){

                System.out.println("Great");
            }


            else if(grade>=70 && grade<=79){

                System.out.println("Good");
            }


            else if(grade>=60 && grade<=69){

                System.out.println("Passed");
            }

            else{

                System.out.println("Failed");
            }

        }else{
            System.out.println("Invalid Grade");
        }


    }
}

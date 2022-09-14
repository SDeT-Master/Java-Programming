package day08_IfStatement;

public class GradeLevel {

    public static void main(String[] args) {


        byte grade=1; //1~18


        if(grade>=1&& grade<=5){

            System.out.println("Elementary school");
        }
        else if(grade>=6 && grade<=8){
            System.out.println("Middle school");
        }

        else if(grade>=1 && grade<=12){
            System.out.println("High school");
        }

        else if(grade>=13 && grade<=16)


        {
            System.out.println("College");

        }

        else{
            System.out.println("Grad school");

        }



    }
}
/*2.  Given a number(byte) grade level determine and print which
school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School

 */
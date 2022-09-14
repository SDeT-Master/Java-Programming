package day10_NestedIf;

public class GradeLevel {

    public static void main(String[] args) {

        byte grade=18;
        String whatLevel="";


        if(grade>=1 && grade<=18) {
            if (grade >= 1 && grade <= 5) {
                whatLevel = "Elementary School";

            } else if (grade >= 6 && grade <= 8) {
                whatLevel = "Middle School";
            } else if (grade >= 9 && grade <= 12) {
                whatLevel = "High School";
            } else if (grade >= 13 && grade <= 16) {

                whatLevel = "College";
            } else {

                whatLevel = "Grad School";
            }

        } else{
            whatLevel = "Invalid Grade ENTRY!";
        }
        System.out.println(whatLevel);


    }
}



/*1. Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT

 */
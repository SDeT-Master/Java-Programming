package day06_PrimitiveTypeCastings;

public class BirthDay {
    public static void main(String[] args) {


        String name="Enver";
        int birthDay=01;
        String birthMonth="June";
        int birthYear=1996;


        // name was born on month/day/year


        System.out.println(name+" was born on"+" "+birthMonth+"/"+birthDay+"/"+birthYear);


        System.out.println("\n");

        //My favorite book is "Book name"


        System.out.println("My favorite book is: \"Rich Dad and Poor Dad\"");

        String myFavoritebook="Rich dad and poor dad";


        System.out.println("My favorite book is" + " \""+myFavoritebook+"\"");



    }


}




/*

1. Create a class named BirthDay and create the following variable
 name, birthDay(int), birthMonth(String),
birthYear(int)
 use concatenation to display the birthday of
the person
 if  name = "John"
 birthDay = 25
     birthMonth = "April"
     birthYear = 1995;
 output:
 John was born on
April/25/1995.
Primitives:
double > float > long > int > short > byte
smaller primitives can be directly assigned to larger primitive type
larger ptimitives can NOT be directly assigned to smaller primitive
types (need to be casted manually)

 */
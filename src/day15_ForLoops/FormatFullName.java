package day15_ForLoops;

public class FormatFullName {

    public static void main(String[] args) {

      String  firstName = "JaSon",
        lastName = "MAc";


     // firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
     //   System.out.println(firstName);


        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
                                // C                                                //ydeo


        System.out.println(firstName);


        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(lastName);


        String fullName=firstName+ " "+lastName;

        System.out.println(fullName);



    }
}


/*
3. Write a program that asks user to enter first and last names, and
then prints the full name in regular format (first character in upper
case)
input:
firstName = "cyDEo"
lastName = "SCHOOL";
output:
Cydeo School
 */